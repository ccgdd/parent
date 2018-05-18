package com.resthome.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resthome.service.ContentCategoryService;
import com.resthome.utils.RestHomeResult;
import com.resthome.mapper.TbContentCategoryMapper;
import com.resthome.pojo.EasyUITreeNode;
import com.resthome.pojo.TbContentCategory;
import com.resthome.pojo.TbContentCategoryExample;
import com.resthome.pojo.TbContentCategoryExample.Criteria;
/**
 * 内容分类管理
 * @author Administrator
 *
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;
	
	@Override
	public List<EasyUITreeNode> getContentCategoryList(Long parentId) {
		// 1、取查询参数id，parentId
		// 2、根据parentId查询tb_content_category，查询子节点列表。
		TbContentCategoryExample example = new TbContentCategoryExample();
		//设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		// 3、得到List<TbContentCategory>
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		// 4、把列表转换成List<EasyUITreeNode>
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbContentCategory : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent()?"closed":"open");
			//添加到列表
			resultList.add(node);
		}
		return resultList;
	}

	
	/**
	 * 新增节点
	 */
	public RestHomeResult addContentCategory(long parentId, String name) {
		// 1、接收两个参数：parentId、name
		// 2、向tb_content_category表中插入数据。
		// a)创建一个TbContentCategory对象
		TbContentCategory tbContentCategory = new TbContentCategory();
		// b)补全TbContentCategory对象的属性
		tbContentCategory.setIsParent(false);
		tbContentCategory.setName(name);
		tbContentCategory.setParentId(parentId);
		//排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
		tbContentCategory.setSortOrder(1);
		//状态。可选值:1(正常),2(删除)
		tbContentCategory.setStatus(1);
		tbContentCategory.setCreated(new Date());
		tbContentCategory.setUpdated(new Date());
		// c)向tb_content_category表中插入数据
		contentCategoryMapper.insert(tbContentCategory);
		// 3、判断父节点的isparent是否为true，不是true需要改为true。
		TbContentCategory parentNode = contentCategoryMapper.selectByPrimaryKey(parentId);
		if (!parentNode.getIsParent()) {
			parentNode.setIsParent(true);
			//更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentNode);
		}
		// 4、需要主键返回。
		// 5、返回E3Result，其中包装TbContentCategory对象
		return RestHomeResult.ok(tbContentCategory);
	}
	
	
	/**
	 * 重命名节点
	 */
	public RestHomeResult updateCategoryName(long id, String name) {
		TbContentCategory tbContentCategory = new TbContentCategory();
		tbContentCategory.setName(name);
		tbContentCategory.setId(id);
		contentCategoryMapper.updateByPrimaryKeySelective(tbContentCategory);
		return RestHomeResult.ok();
	}

	/**
	 * 删除节点id
	 */
	public RestHomeResult deleteNode(Long parentId, Long id) {
		
		//判断当期节点是否为父节点
		TbContentCategory tbc = contentCategoryMapper.selectByPrimaryKey(id);
		if (tbc.getIsParent()) {
			TbContentCategoryExample example = new TbContentCategoryExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andParentIdEqualTo(id);
			long i = contentCategoryMapper.countByExample(example);
			if (i==0) {
				tbc.setIsParent(false);
			}
			return RestHomeResult.build(500, "父节点不允许删除");
		}else {
			contentCategoryMapper.deleteByPrimaryKey(id);
			return RestHomeResult.ok();
		}
		
	}

	
}
