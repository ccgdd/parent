package com.resthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.GoodsInDetailMapper;
import com.resthome.mapper.GoodsInMapper;
import com.resthome.mapper.GoodsInformationMapper;
import com.resthome.mapper.UserMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsIn;
import com.resthome.pojo.GoodsInDetail;
import com.resthome.pojo.GoodsInDetailExample;
import com.resthome.pojo.GoodsInDetailExample.Criteria;
import com.resthome.pojo.GoodsInformation;
import com.resthome.pojo.GoodsInformationExample;
import com.resthome.pojo.GoodsQueryVo;
import com.resthome.pojo.User;
import com.resthome.service.GoodsInDetailService;

@Service
public class GoodsInDetailServiceImpl implements GoodsInDetailService {
	
	@Autowired
	private GoodsInMapper goodsInMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private GoodsInDetailMapper gInMapper;
	@Autowired
	private GoodsInformationMapper ginfoMapper;
	
	
	/**
	 * 入库商品添加
	 */
	public void insertGoods(List<GoodsQueryVo> goodsQueryVos) {
		//插入goods-in表
		GoodsIn goodsIn = new GoodsIn();
		GoodsQueryVo goodsQueryVo = goodsQueryVos.get(0);
		goodsIn.setUserId(goodsQueryVo.getUserId());
		goodsIn.setInCode(goodsQueryVo.getInCode());
		goodsIn.setAddress(goodsQueryVo.getAddress());
		goodsIn.setInDate(goodsQueryVo.getInDate());
		goodsIn.setPersonName(goodsQueryVo.getPersonName());
		goodsIn.setSource(goodsQueryVo.getSource());
		User user = userMapper.selectByPrimaryKey(goodsQueryVo.getUserId());
		goodsIn.setHandledName(user.getUsername());
		goodsInMapper.insertSelective(goodsIn);
		//插入goods_in_detail表
		Integer goodsNum = 0;
		GoodsInDetail gInDetail = new GoodsInDetail();
		int i=0;
		for (GoodsQueryVo goodsQueryVo2 : goodsQueryVos) {
			gInDetail.setInCode(goodsQueryVo2.getInCode());
			gInDetail.setGoodsName(goodsQueryVo2.getGoodsName());
			gInDetail.setGoodsNum(goodsQueryVo2.getGoodsNum());
			gInDetail.setGoodsPrice(goodsQueryVo2.getGoodsPrice());
			gInDetail.setGoodsUnit(goodsQueryVo2.getGoodsUnit());
			//插入GoodsInDetail表
			gInMapper.insertSelective(gInDetail);
			
			
			Integer goodsDetailId = gInDetail.getGoodsDetailId();
		    goodsNum += goodsQueryVo2.getGoodsNum();
		    //插入goodinfomation表
		    GoodsInformation gInformation= new GoodsInformation();
		    gInformation.setGoodsId(goodsDetailId);
		    gInformation.setGoodsName(goodsQueryVo2.getGoodsName());
//		    gInformation.setNowNum(goodsNum);
		    //设置入库数量
		    gInformation.setInNum(goodsNum);
		    gInformation.setPrice(goodsQueryVo2.getGoodsPrice());
		    gInformation.setGoodsNumber(goodsQueryVo2.getGoodsUnit());
		    gInformation.setSource(goodsQueryVo.getSource());
			GoodsInformationExample example = new GoodsInformationExample();
			//查询goodinfomation表的内容
		    List<GoodsInformation> list = ginfoMapper.selectByExample(example);
		    
		    for (GoodsInformation goodsInformation : list) {
		    	
		    	//判断goodinfomation表中是否有入库的字段
				if (goodsInformation.getGoodsName().equals(goodsQueryVo2.getGoodsName())) {
					//找到相同名字的字段进行更新goodinfomation
					example.createCriteria().andGoodsNameEqualTo(goodsQueryVo.getGoodsName());
					Integer inNum = goodsInformation.getInNum();
					Integer nowNum = goodsInformation.getNowNum();
					gInformation.setInNum(goodsQueryVo2.getGoodsNum()+inNum);
					gInformation.setNowNum(goodsQueryVo2.getGoodsNum()+nowNum);
					i = ginfoMapper.updateByExampleSelective(gInformation, example);
				}
			}
		    if (i==0) {
		    	gInformation.setInNum(goodsQueryVo2.getGoodsNum());
		    	gInformation.setNowNum(goodsQueryVo2.getGoodsNum());
				ginfoMapper.insertSelective(gInformation);
				i=0;
			}
		    Integer integer = ++goodsDetailId;
		    gInDetail.setGoodsDetailId(null);
		    gInformation.setGoodsId(integer);
		    
		}
	}

	/**
	 * 入库信息查询
	 */
	public EasyUIDataGridRestful queryGoodsIn(GoodsIn goodsIn, int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<GoodsQueryVo> list = goodsInMapper.queryGoodsIn( goodsIn);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<GoodsQueryVo> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}
	
	/**
	 * 入库信息详细查询
	 */
	public List<GoodsInDetail> queryGoodsInDetail(Integer inCode){
		GoodsInDetailExample example = new GoodsInDetailExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andInCodeEqualTo(inCode);
		List<GoodsInDetail> list = gInMapper.selectByExample(example);
		return list;
	}

	@Override
	public GoodsIn queryGoodsIn(Integer incode) {
		GoodsIn goodsIn = goodsInMapper.selectByPrimaryKey(incode);
		return goodsIn;
	}

	
	
}
