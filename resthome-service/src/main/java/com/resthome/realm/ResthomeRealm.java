package com.resthome.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.resthome.mapper.UserMapper;
import com.resthome.pojo.AuthFunction;
import com.resthome.pojo.User;
import com.resthome.service.UserService;

public class ResthomeRealm extends AuthorizingRealm{
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private UserMapper usermapper;
	
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		
		//获得当前登录用户对象
		User user = (User) principals.getPrimaryPrincipal();
		//根据当前用户查询数据库,获得对应的权限
		List<User> list = null;
		if (user.getUsername().equals("admin")) {
			//admin查询所有
			String id = null;
			 list= usermapper.queryUserFunction(id);
		}else {
			 list = usermapper.queryUserFunction(user.getId());
		}
		
		for (User user2 : list) {
			List<AuthFunction> functionsList = user2.getFunctionsList();
			for (AuthFunction authFunction : functionsList) {
				
				String code = authFunction.getCode();
				if (code!=null) {
					
					info.addStringPermission(authFunction.getCode());
				}
			}
		}
		
		return info;
	}
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken passwordToken = (UsernamePasswordToken) token;
		//获得页面输入的用户名
		String username = passwordToken.getUsername();
		//根据用户名查询数据库中的密码
		User user = userService.findUserByUsername(username);
		if (user==null) {
			return null;
		}
		
		//框架负责比对数据库中的密码和页面中的密码是否一致
		//user被绑定到threadload本地线程
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(),this.getName());
		
		return info;
	}

}
