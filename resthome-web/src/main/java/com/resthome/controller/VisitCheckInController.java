package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.VisitCheckinMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.VisitCheckin;
import com.resthome.pojo.VisitCheckinExample;
import com.resthome.utils.GenerateId;
@Controller
public class VisitCheckInController {

	@Autowired
	public VisitCheckinMapper visitCheckinMapper;
	
	/**
	 * 查询
	 * @param 
	 * @return
	 */
	@RequestMapping("visit/select")
	@ResponseBody
	public EasyUIDataGridRestful selectVistCheckIn(int page,int rows){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		VisitCheckinExample example = new VisitCheckinExample();
		List<VisitCheckin> list = visitCheckinMapper.selectByExample(example);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<VisitCheckin> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	
	
	/**
	 * 添加
	 */
	@RequestMapping("visit/insert")
	public String insertOlaman1(VisitCheckin visitCheckin){
		visitCheckin.setVisitId((Long.parseLong( GenerateId.getLocalTrmSeqNum().substring(12, 19) )));
		visitCheckinMapper.insert(visitCheckin);
		
		
		return "redirect:/page_jiedairecept_visit-recept.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("visit/delete")
	public String deleteBath(Long[] ids){
		for (Long id : ids) {
			
			if (id!=null) {
				visitCheckinMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_jiedairecept_visit-recept.action";
		
	}
}
