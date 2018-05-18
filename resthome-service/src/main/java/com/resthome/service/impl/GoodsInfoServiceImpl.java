package com.resthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.GoodsInformationMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInformation;
import com.resthome.pojo.GoodsInformationExample;
import com.resthome.service.GoodsInfoService;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

	@Autowired
	private GoodsInformationMapper mapper;
	
	@Override
	public void insertGoodsInfo(GoodsInformation goodsInfo) {
		if (goodsInfo.getNowNum()==null&&goodsInfo.getInNum()==null&&goodsInfo.getOutNum()==null) {
			goodsInfo.setNowNum(0);
			goodsInfo.setInNum(0);
			goodsInfo.setOutNum(0);
		}
		mapper.insertSelective(goodsInfo);
	}

	@Override
	public EasyUIDataGridRestful queryGoodsInfo(GoodsInformation goodsInfo, int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		GoodsInformationExample example = new GoodsInformationExample();
		List<GoodsInformation> list = mapper.selectByExample(example);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<GoodsInformation> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

	@Override
	public void editGoodsInfo(GoodsInformation goodsInfo) {
		mapper.updateByPrimaryKeySelective(goodsInfo);

	}

	@Override
	public void deleteGoodsInfo(Integer[] ids) {
		for (Integer id : ids) {
			mapper.deleteByPrimaryKey(id);
		}
		
	}

	/**
	 * ajax
	 */
	public List<GoodsInformation> GoodsInfolistajax() {
		GoodsInformationExample example = new GoodsInformationExample();
		List<GoodsInformation> list = mapper.selectByExample(example);
		return list;
	}

}
