package com.resthome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.CostJiesuanMapper;
import com.resthome.pojo.CollectionCost;
import com.resthome.pojo.CollectionCostExample;
import com.resthome.pojo.CostJiesuan;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.utils.GenerateId;
/**
 * 费用结算
 */
@Controller
public class CostJiesuanController {

	@Autowired
	public CostJiesuanMapper costJiesuanMapper;
	
	/**
	 * 查询
	 * @param 
	 * @return
	 */
	@RequestMapping("jiesuan/select")
	@ResponseBody
	public EasyUIDataGridRestful selectJiesuan(int page,int rows){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<CostJiesuan> list = costJiesuanMapper.selectJiesuan();
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<CostJiesuan> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	
	
	/**
	 * 添加
	 */
	@RequestMapping("jiesuan/insert")
	public String insertOlaman1(CostJiesuan costJiesuan){
		costJiesuan.setCostJiesuanId(GenerateId.getLocalTrmSeqNum().substring(12, 19));
		costJiesuanMapper.insert(costJiesuan);
		
		
		return "redirect:/page_cost_cost-jiesuan.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("jiesuan/delete")
	public String deleteBath(String[] ids){
		for (String id : ids) {
			
			if (id!=null) {
				costJiesuanMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_cost_cost-jiesuan.action";
		
	}
}
