package com.resthome.service;

import java.util.List;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsIn;
import com.resthome.pojo.GoodsInDetail;
import com.resthome.pojo.GoodsQueryVo;

public interface GoodsInDetailService {

	void insertGoods(List<GoodsQueryVo> goodsQueryVos);

	EasyUIDataGridRestful queryGoodsIn(GoodsIn goodsIn, int page, int rows);

	
	public List<GoodsInDetail> queryGoodsInDetail(Integer inCode);

	GoodsIn queryGoodsIn(Integer incode);

}
