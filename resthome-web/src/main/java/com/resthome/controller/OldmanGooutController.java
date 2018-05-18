package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.OldmanGooutMapper;
import com.resthome.mapper.OldmanMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.OldmanGoout;
import com.resthome.utils.GenerateId;


/**
 * 老人外出
 * @author Administrator
 *
 */
@Controller
public class OldmanGooutController {

	@Autowired
	private OldmanGooutMapper oGooutMapper;
	@Autowired
	private OldmanMapper oldmanMapper;
	
	@RequestMapping("oldman/selectGoout")
	@ResponseBody
	public EasyUIDataGridRestful selectTuoguan(int page,int rows,OldmanGoout oldmanGoout){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<OldmanGoout> list = oGooutMapper.selectOldmanGoout( oldmanGoout);
		
		for (OldmanGoout oldmanGoout2 : list) {
			String withName = oldmanGoout2.getWithName();
			Oldman oldman = oldmanMapper.selectByPrimaryKey(Integer.parseInt(withName));
			oldmanGoout2.setWithName(oldman.getName());
		}
		
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<OldmanGoout> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	

	/**
	 * 添加
	 */
	@RequestMapping("oldman/insertGoout")
	public String insertOlaman1(OldmanGoout oldmanGoout){
		oldmanGoout.setGooutId(GenerateId.getLocalTrmSeqNum());
		oGooutMapper.insert(oldmanGoout);
		
		
		return "redirect:/page_recept_goOut.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("oldman/deleteGoout")
	public String deleteBath(String[] ids){
		for (String id : ids) {
			
			if (id!=null) {
				oGooutMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_recept_goOut.action";
		
	}
	
}
