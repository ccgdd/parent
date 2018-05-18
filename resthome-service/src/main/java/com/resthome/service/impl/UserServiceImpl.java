package com.resthome.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resthome.mapper.AuthRoleMapper;
import com.resthome.mapper.UserMapper;
import com.resthome.pojo.User;
import com.resthome.pojo.UserExample;
import com.resthome.pojo.UserExample.Criteria;
import com.resthome.service.UserService;
import com.resthome.utils.MD5Utils;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private AuthRoleMapper roleMapper;
	
	/**
	 * 根据用户名查询数据库中的密码
	 */
	@Override
	public User findUserByUsername(String username) {
		
		UserExample example = new UserExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUsernameEqualTo(username);
		
		List<User> list = userMapper.selectByExample(example);
		
			if (list.size()>0) {
				User user = list.get(0);
				return user;
			}
		
		return null;
	}
	/**
	 * 插入用户数据
	 */
	@Override
	public void insertUser(User user, String[] roleIds) {
		String password = user.getPassword();
		String md5 = MD5Utils.md5(password);
		user.setPassword(md5);
		user.setId(UUID.randomUUID().toString().replace("-", ""));
		userMapper.insert(user);
		if (roleIds!=null&&roleIds.length>0) {
			HashMap<Object,Object> saveParams = new HashMap<>(); 
			saveParams.put("userId", user.getId());
			saveParams.put("roleIds", roleIds);
			userMapper.insertUserAndRole(saveParams);
			
		}
	}

	/**
	 * 查询用户数据
	 */
	public List<User> queryUserAndRole() {
		// 查询数据结果集
		 List<User> list = roleMapper.queryUserAndRole();
		for (User user : list) {
			System.out.println(user); 
		}
		
		return list;
	}

	

	/**
	 * 
	 * 修改用户数据
	 */
	public void editUserAndRole(String[] roleIds, User user) {
			//修改用户表
			String password = user.getPassword();
			user.setPassword(MD5Utils.md5(password));
			userMapper.updateByPrimaryKeySelective(user);
			if (roleIds!=null) {
					//修改用户角色表
					HashMap<Object, Object> map = new HashMap<>();
					map.put("userId", user.getId());
					map.put("roleIds", roleIds);
					userMapper.deleteRoleIdByUserId(user.getId());
					userMapper.insertUserAndRole(map);
			}
		
	}
	
	/**
	 * 删除用户信息
	 */
	
	public void deleteUser(String[] ids) {
		for (String id : ids) {
			userMapper.deleteRoleIdByUserId(id);
			userMapper.deleteByPrimaryKey(id);
			
		}
		
	}
	
	
	@Override
	public List<User> listajax() {
		List<User> list = userMapper.listajax();
		return list;
	}
}