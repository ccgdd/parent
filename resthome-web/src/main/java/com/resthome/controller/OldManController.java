package com.resthome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.Age;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.QueryVo;
import com.resthome.service.OldManService;
 
@Controller
public class OldManController {

	@Autowired
	public OldManService oldmanService;
	
	@RequestMapping("json/oldman")
	@ResponseBody
	public EasyUIDataGridRestful getOldManList(QueryVo queryVo){
		EasyUIDataGridRestful result = oldmanService.getOldManList(queryVo);
		
		return result;
	}
	
	
	@RequestMapping("oldman/listajax")
	@ResponseBody
	public List<Oldman> getOldMAN(){
		List<Oldman> list = oldmanService .getOldManList();
		return list;
	}
	
	
	/**
	 * 添加老人信息
	 */
	@RequestMapping("oldman/add")
	public String insertOlaman(Oldman oldman){
		oldmanService.insertOlaman(oldman);
	return "redirect:/page_recept_oldman.action"	;
		
	}
	
	/**
	 * 添加老人信息
	 */
	@RequestMapping("oldman/add1")
	public String insertOlaman1(Oldman oldman){
		oldmanService.insertOlaman(oldman);
		return "redirect:/page_recept_check-in.action"	;
		
	}
	
	
	/**
	 * 修改老人信息
	 */
	@RequestMapping("oldman/edit")
	public String editOlaman(Oldman oldman){
		oldmanService.editOlaman(oldman);
	return "redirect:/page_recept_oldman.action";
		
	}
	
	
	
	
	/**
	 * 删除老人信息
	 */
	@RequestMapping("/oldman/delete")
	public String deleteBath(String ids){
		
		oldmanService.deleteBath(ids);
		
		return "redirect:/page_recept_oldman.action";
		
	}
	
	/**
	 * 删除老人信息
	 */
	@RequestMapping("/oldman/delete1")
	public String deleteBath1(String ids){
		
		oldmanService.deleteBath(ids);
		
		return "redirect:/page_recept_check-in.action";
		
	}
	
	/**
	 * 删除老人信息
	 */
	@RequestMapping("oldman/delete2")
	public String deleteBath2(String ids){
		
		oldmanService.deleteBath(ids);
		
		return "redirect:/page_recept_goOut.action";
		
	}
	
	
	/**
	 * 图标展示
	 */
	
	
	
	@RequestMapping(value="oldman/findGroupByAge")
	@ResponseBody
	public String findGroupByAge(){
		List<Age> list = oldmanService .findGroupByAge();
		String json = "";
		for (Age age : list) {
			Integer age2 = age.getAge();
			Integer count = age.getCount();
			json+=","+"["+"'people age of "+age2.toString()+"'"+','+count+"]";
		}
		String substring = json.substring(1, json.length());
		
		String jsString = "["+substring+"]";
		
		return jsString;
	}
	
	
	
	
}
