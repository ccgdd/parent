package com.resthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.Bed;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.service.BedService;
import com.resthome.utils.RestHomeResult;

@Controller
public class BedController {

	@Autowired
	private BedService service;
	
	
	@RequestMapping("/content/query/list")
	@ResponseBody
	public EasyUIDataGridRestful getBedList(int categoryId, int page,int rows){
		
		EasyUIDataGridRestful list = service.getBedList(categoryId, page, rows);
		System.out.println(list.toString());
		return list;
	}
	
	/**
	 * 新增床位信息
	 * @param bed
	 * @param categoryId
	 * @return
	 */
	@RequestMapping("content/save")
	@ResponseBody
	public RestHomeResult insertBed(Bed bed,int categoryId){
		
		RestHomeResult result = service.insertBed(bed, categoryId);
		
		return result;
	}
	
	
	/**
	 * 修改床位信息
	 */
	
	@RequestMapping(value = "/rest/content/edit",method = RequestMethod.POST)
	@ResponseBody
	public RestHomeResult EditBed(Bed bed){
		
		RestHomeResult result = service.EditBed(bed);
		
		return result;
	}
	
	
	/**
	 * 删除床位信息
	 */
	@RequestMapping("/content/delete")
	@ResponseBody
	public RestHomeResult deleteBath(String ids){
		
		RestHomeResult result = service.deleteBath(ids);
		
		return result;
		
	}
	
	
}
