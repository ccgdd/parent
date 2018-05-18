package com.resthome.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsIn;
import com.resthome.pojo.GoodsInDetail;
import com.resthome.pojo.GoodsQueryVo;
import com.resthome.service.GoodsInDetailService;

@Controller
public class GoodsInDetailController {
	@Autowired 
	private GoodsInDetailService service;
	
	
	/**
	 * 商品入库添加
	 * @param goodsQueryVos
	 * @return
	 */
	@RequestMapping("user/submitUserList_4") 
	public String submitUserList_4(@RequestBody List<GoodsQueryVo> goodsQueryVos ) {
		
		service.insertGoods(goodsQueryVos);
		
		
		return "pages/goods/goods-in";
	}
	
	
	/**
	 * 入库信息详情查询
	 */
	@RequestMapping("goodsIn/detail")
	public String queryGoodsInDeatil(Model model,Integer incode){
		GoodsIn goodsIn = 	service.queryGoodsIn(incode);
		List<GoodsInDetail> goodsInDetails = service.queryGoodsInDetail(incode);
		Date inDate = goodsIn.getInDate();
		String format2= null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if (inDate!=null) {
			
			 format2 = format.format(inDate);
		}
		
		// 把GoodsIn数据放在模型中
		model.addAttribute("goodsIn", goodsIn);
		model.addAttribute("format2", format2);
		//
		model.addAttribute("goodsInDetails", goodsInDetails);
		return "pages/goods/goods-in-detail";
	
	
	}
	
	@RequestMapping("goodsIn/query")
	@ResponseBody
	public EasyUIDataGridRestful  queryGoodsIn(GoodsIn goodsIn, int page, int rows){
		
		EasyUIDataGridRestful queryGoodsIn = service.queryGoodsIn(goodsIn, page, rows);
		
		return queryGoodsIn;
		
	}
	
}
