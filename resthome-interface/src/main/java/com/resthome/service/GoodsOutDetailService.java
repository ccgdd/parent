package com.resthome.service;

import java.util.List;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsOut;
import com.resthome.pojo.GoodsOutDetail;

public interface GoodsOutDetailService {
		
	
	public void insertGoodsOut(List<GoodsOut> goodsOuts);

	public EasyUIDataGridRestful queryGoodsOut(GoodsOut goodsOut, int page, int rows);

	public GoodsOut queryGoodsOut(Integer outcode);

	public List<GoodsOutDetail> queryGoodsOutDetail(Integer outcode);
}
