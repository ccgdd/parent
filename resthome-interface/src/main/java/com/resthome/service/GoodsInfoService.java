package com.resthome.service;

import java.util.List;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInformation;

public interface GoodsInfoService {

	public void insertGoodsInfo(GoodsInformation goodsInfo);
	
	public EasyUIDataGridRestful queryGoodsInfo(GoodsInformation goodsInfo, int page, int rows);
	
	public void editGoodsInfo(GoodsInformation goodsInfo);
	
	public void deleteGoodsInfo(Integer[] ids);

	public List<GoodsInformation> GoodsInfolistajax();

}
