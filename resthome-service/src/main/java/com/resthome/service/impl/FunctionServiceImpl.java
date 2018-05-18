package com.resthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.AuthFunctionMapper;
import com.resthome.pojo.AuthFunction;
import com.resthome.pojo.AuthFunctionExample;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.service.FunctionService;
@Service
public class FunctionServiceImpl implements FunctionService{

	@Autowired
	AuthFunctionMapper authFunctionMapper;
	
	
	/**
	 * 权限信息分页查询
	 * 
	 */
	public EasyUIDataGridRestful pageQuery(int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		AuthFunctionExample example = new AuthFunctionExample();
		  List<AuthFunction> list = authFunctionMapper.selectByExample(example);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<AuthFunction> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}
	
	
	/**
	 * 新增权限信息
	 */
	 public void insertFunction(AuthFunction function){
		 
		 authFunctionMapper.insertSelective(function);
		  
	 }
	
	 /**
	  * 
	  */
	 public List<AuthFunction> selectTreeNode(){
		 
		 List<AuthFunction> list = authFunctionMapper.selectByExample(null);
		 
		 return list;
	 }
	 
	 
	 
}
