package com.resthome.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.CostTuoguanMapper;
import com.resthome.pojo.CollectionCost;
import com.resthome.pojo.CollectionCostExample;
import com.resthome.pojo.CostTuoguan;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.utils.GenerateId;
/**
 * 财务托管
 */
@Controller
public class CostTuoguanController {

	@Autowired
	public CostTuoguanMapper costTuoguanMapper;
	
	/**
	 * 查询
	 * @param 
	 * @return
	 */
	@RequestMapping("tuoguan/select")
	@ResponseBody
	public EasyUIDataGridRestful selectTuoguan(int page,int rows){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<CostTuoguan> list = costTuoguanMapper.selectTuoguan();
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<CostTuoguan> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	
	
	/**
	 * 添加
	 */
	@RequestMapping("tuoguan/insert")
	public String insertOlaman1(CostTuoguan costTuoguan){
		costTuoguan.setTuoguanId(Integer.parseInt(GenerateId.getLocalTrmSeqNum().substring(13, 18)));
		costTuoguanMapper.insert(costTuoguan);
		
		
		return "redirect:/page_cost_cost-tuoguan.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("tuoguan/delete")
	public String deleteBath(Integer[] ids){
		for (Integer id : ids) {
			
			if (id!=null) {
				costTuoguanMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_cost_cost-tuoguan.action";
		
	}
}
