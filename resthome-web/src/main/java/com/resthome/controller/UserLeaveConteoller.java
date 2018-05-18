package com.resthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.StaffTranfer;
import com.resthome.pojo.UserLeave;
import com.resthome.service.UserLeaveService;
import com.resthome.service.UserManagerService;

@Controller
public class UserLeaveConteoller {

	@Autowired
	private UserLeaveService service;
	
	
	
	@RequestMapping("userLeave/add")
	public String insertUserLeave(UserLeave userLeave){
		
		service.insertUserLeave(userLeave );
		
		return "redirect:/page_userManager_user-leave.action";
	}
	
	/**
	 * 查询
	 */
	@RequestMapping("userLeave/query")
	@ResponseBody
	public EasyUIDataGridRestful queryUserLeave(UserLeave userLeave,int page,int rows){
		
		EasyUIDataGridRestful result = service.queryUserLeave(userLeave, page, rows);
		
		return result;
	
	
	}
		
	/**
	 * 修改
	 */
	
	@RequestMapping("userLeave/edit")
	public String editUserLeave(UserLeave userLeave){
		
		  service.editUserLeave(userLeave);
		
		return "redirect:/page_userManager_user-leave.action";
	
	
	}
	
	
	
	/**
	 * 删除用户信息
	 */
	@RequestMapping("userLeave/delete")
	public String deleteUserLeave(Integer[] ids){
		if (ids!=null) {
			service.deleteUserLeave(ids);
		}
		
		return "redirect:/page_userManager_user-leave.action";
	}
}
