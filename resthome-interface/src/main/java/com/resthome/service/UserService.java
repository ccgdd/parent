package com.resthome.service;

import java.util.List;

import com.resthome.pojo.User;

public interface UserService {


	public User findUserByUsername(String username);
	
	public  void  insertUser(User user ,String[] roleIds);
	
	public List<User> queryUserAndRole();
	
	
	void editUserAndRole(String[] roleIds, User user );
	
	
	public void deleteUser(String[] ids) ;
	
	
	List<User> listajax();
}
