package com.resthome.service;

import java.util.List;

import com.resthome.pojo.AuthRole;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.RoleQueryVo;

public interface RoleService {

	
	public void insertRole(RoleQueryVo roleQueryVo);

	public EasyUIDataGridRestful getRoleList(int page , int rows);
	
	public  List<AuthRole>  selectAllRole();
}
