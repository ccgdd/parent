package com.resthome.service;

import com.resthome.pojo.Bed;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.utils.RestHomeResult;

public interface BedService {
	public EasyUIDataGridRestful getBedList(int cid,int page, int rows);
	
	public RestHomeResult insertBed(Bed bed,int cid);
	
	
	public RestHomeResult EditBed(Bed bed);
	
	
	public RestHomeResult deleteBath(String ids);
}
