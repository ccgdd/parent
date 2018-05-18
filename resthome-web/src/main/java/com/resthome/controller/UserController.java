package com.resthome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resthome.mapper.UserMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.User;
import com.resthome.service.UserService;
import com.resthome.utils.MD5Utils;
@SuppressWarnings("all")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	//使用是shiro框架提供的方法进行权限认证
	@RequestMapping("useraction_login.action")
	public String login(HttpSession httpSession,User user,String checkcode,Model model){
		//从session中获得生成的验证码
		String validatecode = (String) httpSession.getAttribute("key");
		if(true/*StringUtils.isNotBlank(checkcode) && checkcode.equals(validatecode)*/){
			Subject subject = SecurityUtils.getSubject();//获得当前用户对象,"状态为未认证"
			AuthenticationToken token = new UsernamePasswordToken(user.getUsername(),MD5Utils.md5(user.getPassword()));//创建用户名密码令牌对象
			
			try {
				
				subject.login(token);//这里会默认调用安全管理器
				
				 user = (User) subject.getPrincipal();
				//登录成功,将user对象放入session，跳转到首页
				httpSession.setAttribute("loginUser", user);
				return "pages/common/index";
			} catch (Exception e) {
				//登录失败，,设置提示信息，跳转到登录页面
				//输入的验证码错误,设置提示信息，跳转到登录页面
				model.addAttribute("message", "用户名或者密码输入错误！");
				return "login";
			}
		}else{
			//输入的验证码错误,设置提示信息，跳转到登录页面
		 	model.addAttribute("message", "输入的验证码错误！！");
			return "login";
		}
		
		
	}
	
	
	/*@RequestMapping("useraction_login.action")
	public String login(HttpSession httpSession,User user,String checkcode,Model model){
		//从session中获得生成的验证码
		String validatecode = (String) httpSession.getAttribute("key");
		if(StringUtils.isNotBlank(checkcode) && checkcode.equals(validatecode)){
			//输入的验证码正确
			user = userService.login(user);
			if(user != null){
				//登录成功,将user对象放入session，跳转到首页
				httpSession.setAttribute("loginUser", user);
				return "pages/common/index";
			}else{
				//登录失败，,设置提示信息，跳转到登录页面
				//输入的验证码错误,设置提示信息，跳转到登录页面
				model.addAttribute("message", "用户名或者密码输入错误！");
				return "login";
			}
		}else{
			//输入的验证码错误,设置提示信息，跳转到登录页面
		 	model.addAttribute("message", "输入的验证码错误！！");
			return "login";
		}
	}*/
		
	@RequestMapping("/loginout")
	public String loginout(HttpSession httpSession){
			httpSession.removeAttribute("loginUser");
			return "login";
		
	}	
	
	
	/**
	 * 插入角色
	 */
	@RequestMapping("user/add")
	public String insertUser(String[] roleIds, User user){		
		
		userService.insertUser(user, roleIds);
		
		return "redirect:/page_admin_userlist.action";
	}
	
	/**
	 * 查询用户
	 */
	
	@RequestMapping("user/query")
	@ResponseBody
	public List<User> queryUserAndRole( ){
		 List<User> list = userService.queryUserAndRole();
		return list;
	}


	/**
	 * 修改用户数据
	 */
	
	@RequestMapping("user/edit")
	public String editUserAndRole(String[] roleIds, User user ){
		  userService.editUserAndRole(roleIds, user );
		return "redirect:/page_admin_userlist.action";
	}
	
	
	/**
	 * 删除用户信息
	 */
	@RequestMapping("user/delete")
	public String deleteUser(String[] ids){
		if (ids!=null) {
			
			userService.deleteUser(ids);
		}
		
		return "redirect:/page_admin_userlist.action";
	}
	
	
	@RequestMapping("user/listajax")
	@ResponseBody
	public List<User> listAjax(){
		
		List<User> list = userService.listajax();
		
		return list;
		
	}
	
}
