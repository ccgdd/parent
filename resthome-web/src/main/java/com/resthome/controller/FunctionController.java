package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.AuthFunction;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.service.FunctionService;

@Controller
public class FunctionController {

	@Autowired
	private  FunctionService service;
	
	@RequestMapping("function/pageQuery.action")
	@ResponseBody
	public EasyUIDataGridRestful getBedList(int page,int rows){
		
		EasyUIDataGridRestful list = service.pageQuery( page, rows);
		return list;
	}
	
	
	/**
	 * 添加权限信息
	 */
	@RequestMapping("function/add.action")
	public String insertFunction(AuthFunction function){
		service.insertFunction(function);
	return "redirect:/page_admin_function.action"	;
		
	}
	
	@RequestMapping("/function/tree")
	@ResponseBody
	public List<AuthFunction> selectTreeNode(){
		
		List<AuthFunction> list = service.selectTreeNode();
		
		return list;
		
	}
	
}
