package com.resthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.StaffTranfer;
import com.resthome.service.UserManagerService;

@Controller
public class UserManagerController {

	@Autowired
	private UserManagerService service;
	
	
	@RequestMapping("userManager/add")
	public String insertUserManager(StaffTranfer staffTranfer){
		
		service.insertUserManager(staffTranfer);
		
		return "redirect:/page_userManager_user-transfer.action";
	}
	
	/**
	 * 查询
	 * @param staffTranfer
	 * @return
	 */
	@RequestMapping("userManager/select")
	@ResponseBody
	public EasyUIDataGridRestful selectUserManager(StaffTranfer staffTranfer,int page,int rows){
		
		EasyUIDataGridRestful result = service.selectUserManager(staffTranfer,page,rows);
		
		return result;
	
	
	}
		
	/**
	 * 修改
	 */
	
	@RequestMapping("userManager/edit")
	public String editUserManager(StaffTranfer staffTranfer){
		
		  service.editUserManager(staffTranfer);
		
		return "redirect:/page_userManager_user-transfer.action";
	
	
	}
	
	
	
	/**
	 * 删除用户信息
	 */
	@RequestMapping("userManager/delete")
	public String deleteUser(Integer[] ids){
		if (ids!=null) {
			service.deleteUserManager(ids);
			
		}
		
		return "redirect:/page_userManager_user-transfer.action";
	}
}
