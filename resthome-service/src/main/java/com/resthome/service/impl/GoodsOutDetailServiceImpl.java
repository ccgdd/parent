package com.resthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.GoodsInformationMapper;
import com.resthome.mapper.GoodsOutDetailMapper;
import com.resthome.mapper.GoodsOutMapper;
import com.resthome.mapper.OldmanMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInformation;
import com.resthome.pojo.GoodsInformationExample;
import com.resthome.pojo.GoodsOut;
import com.resthome.pojo.GoodsOutDetail;
import com.resthome.pojo.GoodsOutDetailExample;
import com.resthome.pojo.GoodsOutDetailExample.Criteria;
import com.resthome.pojo.Oldman;
import com.resthome.service.GoodsOutDetailService;
import com.resthome.utils.GenerateId;

@Service
public class GoodsOutDetailServiceImpl implements GoodsOutDetailService {

	@Autowired
	private GoodsOutMapper goMapper;
	@Autowired 
	private GoodsOutDetailMapper godMapper;
	@Autowired
	private GoodsInformationMapper giMapper;

	@Autowired
	private OldmanMapper oldmanMapper;
	
	
	/**
	 * 出库商品插入
	 */
	
	public void insertGoodsOut(List<GoodsOut> goodsOuts) {
	
		//插入goods-out
		GoodsOut goodsOut = goodsOuts.get(0);
		String localTrmSeqNum = GenerateId.getLocalTrmSeqNum().substring(6, 13);
		int parseInt = Integer.parseInt(localTrmSeqNum);
		goodsOut.setOutCode(parseInt);
		//查询oldman表
		Oldman oldman = oldmanMapper.selectByPrimaryKey(goodsOut.getOid());
		goodsOut.setInName(oldman.getName());
		goMapper.insertSelective(goodsOut);
		//插入goods_out_detail表
		GoodsOutDetail goodsOutDetail = new GoodsOutDetail();
		for (GoodsOut goodsOut2 : goodsOuts) {
			goodsOutDetail.setGoodsId(goodsOut2.getGoodsId());
			GoodsInformation information = giMapper.selectByPrimaryKey(goodsOut2.getGoodsId());
			
			
			
			goodsOutDetail.setGoodsName(information.getGoodsName());
			goodsOutDetail.setGoodsNum(goodsOut2.getGoodsNum());
			goodsOutDetail.setGoodsPrice(goodsOut2.getGoodsPrice());
			goodsOutDetail.setGoodsUnit(goodsOut2.getGoodsUnit());
			goodsOutDetail.setOutCode(parseInt);
			//插入GoodsOutDetail表
			godMapper.insertSelective(goodsOutDetail);
			
			GoodsInformationExample example = new GoodsInformationExample();
			List<GoodsInformation> list = giMapper.selectByExample(example);
			for (GoodsInformation goodsInformation : list) {
				if (goodsOut2.getGoodsId()==goodsInformation.getGoodsId()) {
					
					Integer outNum = goodsInformation.getOutNum();
					Integer nowNum = goodsInformation.getNowNum();
					goodsInformation.setOutNum(outNum+goodsOut2.getGoodsNum());
					goodsInformation.setNowNum(nowNum-outNum);
					giMapper.updateByPrimaryKeySelective(goodsInformation);
				}
				
			}
			
			
			
			
		}
		
	}

	/**
	 * 查询
	 */
	public EasyUIDataGridRestful queryGoodsOut(GoodsOut goodsOut, int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<GoodsOut> list = goMapper.queryGoodsOut( goodsOut);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<GoodsOut> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	/**
	 * 双击列表展示
	 */
	@Override
	public GoodsOut queryGoodsOut(Integer outcode) {
		
		GoodsOut goodsOut = goMapper.selectByPrimaryKey(outcode);
		
		return goodsOut;
	}

	@Override
	public List<GoodsOutDetail> queryGoodsOutDetail(Integer outcode) {
		
		
		
		GoodsOutDetailExample example = new GoodsOutDetailExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andOutCodeEqualTo(outcode);
		
		 List<GoodsOutDetail> list = godMapper.selectByExample(example);
		
		 for (GoodsOutDetail goodsOutDetail : list) {
			Integer goodsId = goodsOutDetail.getGoodsId();
			GoodsInformation information = giMapper.selectByPrimaryKey(goodsId);
			goodsOutDetail.setGoodsName(information.getGoodsName());
		}
		 
		return list;
	}

}
