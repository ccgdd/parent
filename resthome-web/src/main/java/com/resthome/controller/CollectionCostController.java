package com.resthome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.CollectionCostMapper;
import com.resthome.pojo.CollectionCost;
import com.resthome.pojo.CollectionCostExample;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.utils.GenerateId;
/**
 * 代收费用
 */
@Controller
public class CollectionCostController {

	@Autowired
	public CollectionCostMapper collectionCostMapper;
	
	/**
	 * 查询
	 * @param 
	 * @return
	 */
	@RequestMapping("collection/select")
	@ResponseBody
	public EasyUIDataGridRestful selectCollection(int page,int rows){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<CollectionCost> list = collectionCostMapper.selectCollection();
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<CollectionCost> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	
	
	/**
	 * 添加
	 */
	@RequestMapping("collection/insert")
	public String insertOlaman1(CollectionCost collectionCost){
		collectionCost.setCostId(( GenerateId.getLocalTrmSeqNum().substring(12, 19)));
		collectionCostMapper.insert(collectionCost);
		
		
		return "redirect:/page_cost_collection-cost.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("collection/delete")
	public String deleteBath(String[] ids){
		for (String id : ids) {
			
			if (id!=null) {
				collectionCostMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_cost_collection-cost.action";
		
	}
}
