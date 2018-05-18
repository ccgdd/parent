package com.resthome.service;

import java.util.List;

import com.resthome.pojo.Age;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.QueryVo;

public interface OldManService {

	 public	EasyUIDataGridRestful getOldManList(QueryVo queryVo);
	
	
	 public List<Oldman> getOldManList();

	 public void insertOlaman(Oldman oldman);
	 
	 
	 public void editOlaman(Oldman oldman);
	 
	 
	 
	 public void deleteBath(String ids);


	public List<Age> findGroupByAge();
	 
	 
}
