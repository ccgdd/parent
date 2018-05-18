package com.resthome.service;

import java.util.List;

import com.resthome.pojo.AuthFunction;
import com.resthome.pojo.EasyUIDataGridRestful;

public interface FunctionService {

	
	public EasyUIDataGridRestful pageQuery(int page, int rows);
	
	 public void insertFunction(AuthFunction function);
	 
	 public List<AuthFunction> selectTreeNode();
}
