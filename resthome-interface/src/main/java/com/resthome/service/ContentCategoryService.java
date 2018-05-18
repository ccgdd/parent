package com.resthome.service;

import java.util.List;

import com.resthome.pojo.EasyUITreeNode;
import com.resthome.utils.RestHomeResult;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCategoryList(Long parentId);
	
	RestHomeResult addContentCategory(long parentId, String name);
	
	RestHomeResult updateCategoryName(long id , String name);
	
	RestHomeResult deleteNode(Long parentId,Long id);
	
}
