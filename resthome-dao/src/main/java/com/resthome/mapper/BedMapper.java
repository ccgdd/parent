package com.resthome.mapper;

import java.util.List;

import com.resthome.pojo.Search;

public interface BedMapper {

	List<Search> getBedlistBy(int cid);
	
}
