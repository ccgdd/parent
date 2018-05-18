package com.resthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.pojo.AuthRole;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.RoleQueryVo;
import com.resthome.service.RoleService;

@Controller
public class RoleController {

	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("role/add")
	public String insertRole(RoleQueryVo roleQueryVo){
		
		roleService.insertRole(roleQueryVo);
		
		return "redirect:/page_admin_role.action";
		
	}
	
	
	@RequestMapping("role/pageQuery.action")
	@ResponseBody
	public EasyUIDataGridRestful getBedList(int page,int rows){
		EasyUIDataGridRestful list = roleService.getRoleList(page, rows);
		return list;
	}
	
	
	/**
	 * 查询所有角色信息
	 */
	@RequestMapping("role/listajax")
	@ResponseBody
	public List<AuthRole> selectAllRole(){
		List<AuthRole> list = roleService.selectAllRole();
		return list;
	}
	
}
