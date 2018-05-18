package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.ReceptCheckinMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.GoodsInformation;
import com.resthome.pojo.GoodsInformationExample;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.QueryVo;
import com.resthome.pojo.ReceptCheckin;
import com.resthome.pojo.ReceptCheckinExample;
import com.resthome.service.OldManService;
import com.resthome.utils.GenerateId;
@Controller
public class ReceptCheckInController {

	@Autowired
	public ReceptCheckinMapper receptCheckinMapper;
	
	/**
	 * 查询
	 * @param queryVo
	 * @return
	 */
	@RequestMapping("jiedai/select")
	@ResponseBody
	public EasyUIDataGridRestful getOldManList(int page,int rows){
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<ReceptCheckin> list = receptCheckinMapper.selectReceptCheckin();
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<ReceptCheckin> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
	
	
	
	
	/**
	 * 添加
	 */
	@RequestMapping("jiedai/insert")
	public String insertOlaman1(ReceptCheckin receptCheckin){
		receptCheckin.setReceptCheckinId(Long.parseLong( GenerateId.getLocalTrmSeqNum().substring(12, 19)) );
		receptCheckinMapper.insert(receptCheckin);
		
		
		return "redirect:/page_jiedairecept_jiedai-recept.action";
		
	}
	
	
	
	/**
	 * 删除
	 */
	@RequestMapping("jiedai/delete")
	public String deleteBath(Long[] ids){
		for (Long id : ids) {
			
			if (id!=null) {
				receptCheckinMapper.deleteByPrimaryKey(id);
			}
		}
		
		return "redirect:/page_jiedairecept_jiedai-recept.action";
		
	}
}
