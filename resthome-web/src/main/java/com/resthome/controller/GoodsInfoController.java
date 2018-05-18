package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInformation;
import com.resthome.service.GoodsInfoService;

@Controller
public class GoodsInfoController {
	@Autowired
	private GoodsInfoService service;
	
	@RequestMapping("goodsInfo/add")
	public String insertGoodsInfo(GoodsInformation goodsInfo){
		
		service.insertGoodsInfo(goodsInfo );
		
		return "redirect:/page_goods_goods-info.action";
	}
	
	
	/**
	 * 查询
	 */
	@RequestMapping("goodsInfo/query")
	@ResponseBody
	public EasyUIDataGridRestful queryGoodsInfo(GoodsInformation goodsInfo,int page,int rows,String inDate){
		
		EasyUIDataGridRestful result = service.queryGoodsInfo(goodsInfo, page, rows);
		
		return result;
	
	
	}
		
	/**
	 * 修改
	 */
	
	@RequestMapping("goodsInfo/edit")
	public String editGoodsInfo(GoodsInformation goodsInfo){
		
		  service.editGoodsInfo(goodsInfo);
		
		  return "redirect:/page_goods_goods-info.action";
	
	
	}
	
	
	
	/**
	 * 删除用户信息
	 */
	@RequestMapping("goodsInfo/delete")
	public String deleteGoodsInfo(Integer[] ids){
		if (ids!=null) {
			service.deleteGoodsInfo(ids);
		}
		
		return "redirect:/page_goods_goods-info.action";
	}
	
	
	@RequestMapping("goodsInfo/listajax")
	@ResponseBody
	public List<GoodsInformation> GoodsInfolistajax(){
		
		List<GoodsInformation> list = service.GoodsInfolistajax();
		
		return list;
	
	
	}
}

