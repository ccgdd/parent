package com.resthome.service.impl;

import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.AuthRoleMapper;
import com.resthome.pojo.AuthRole;
import com.resthome.pojo.AuthRoleExample;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.RoleQueryVo;
import com.resthome.service.RoleService;

@Service
public class RoleServiceimpl implements RoleService{

	@Autowired
	private AuthRoleMapper authRoleMapper;
	
	
	/**
	 * 角色插入
	 */
	public void insertRole(RoleQueryVo roleQueryVo){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		roleQueryVo.getAuthRole().setId(uuid);
		authRoleMapper.insert(roleQueryVo.getAuthRole());
		authRoleMapper.insertRoleAndFcuntion(roleQueryVo);
		
	}
	
	

	/**
	 * 角色信息分页查询
	 */
	@Override
	public EasyUIDataGridRestful getRoleList(int page , int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		
		
		// 查询数据结果集
		AuthRoleExample example = new AuthRoleExample();
		 List<AuthRole> list = authRoleMapper.selectByExample(example);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<AuthRole> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}
	
	/**
	 * 查询所有角色信息
	 */
	public  List<AuthRole>  selectAllRole(){
		
		AuthRoleExample example = new AuthRoleExample();
		List<AuthRole> list = authRoleMapper.selectByExample(example);
		
		return list;
	}
}
