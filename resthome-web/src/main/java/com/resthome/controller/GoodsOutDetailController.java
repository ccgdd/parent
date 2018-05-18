package com.resthome.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInDetail;
import com.resthome.pojo.GoodsOut;
import com.resthome.pojo.GoodsOutDetail;
import com.resthome.service.GoodsOutDetailService;
import com.resthome.utils.RestHomeResult;

@Controller
public class GoodsOutDetailController{
	
	@Autowired
	GoodsOutDetailService service;
	
	/**
	 * 插入入库信息
	 * @param goodsOuts
	 * @return
	 */
	@RequestMapping("goodsOut/insert")
	@ResponseBody
	public RestHomeResult insertGoodsOut(@RequestBody List<GoodsOut> goodsOuts ) {
		
	
		service.insertGoodsOut(goodsOuts);
		
		RestHomeResult result = RestHomeResult.ok();
		
		return result;
	}
	
	/**
	 * 查询入库信息
	 */
	
	@RequestMapping("goodsOut/query")
	@ResponseBody
	public EasyUIDataGridRestful  queryGoodsOut(GoodsOut goodsOut, int page, int rows){
		
		EasyUIDataGridRestful queryGoodsOut = service.queryGoodsOut(goodsOut, page, rows);
		
		return queryGoodsOut;
		
	}
	

	/**
	 * 出库信息详情查询
	 */
	
	@RequestMapping("goodsOut/detail")
	public String queryGoodsInDeatil(Model model,Integer outcode){
	
	GoodsOut goodsOut = service.queryGoodsOut(outcode);
	List<GoodsOutDetail> goodsOutDetail = service.queryGoodsOutDetail(outcode);
	Date outDate = goodsOut.getOutDate();
	
	String format2= null;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	if (outDate!=null) {
		
		 format2 = format.format(outDate);
	}
	// 把Goodsout数据放在模型中
	model.addAttribute("goodsOut", goodsOut);
	model.addAttribute("format2", format2);
	model.addAttribute("goodsOutDetail", goodsOutDetail);
	return "pages/goods/goods-out-detail";
	
	
	}
	
	
	
}