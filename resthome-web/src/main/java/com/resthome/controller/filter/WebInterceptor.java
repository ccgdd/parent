package com.resthome.controller.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WebInterceptor implements HandlerInterceptor{


	@Override
	public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object arg2) throws Exception {
		////从request中获取session
		HttpSession session = request.getSession();
		Object user = session.getAttribute("loginUser");
		if (user != null) {
			//如果不为null则放行
			return true;
		}else{
			//如果为空则跳转到登录页面
			response.sendRedirect("login.jsp");
		}
		
		return false;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		
		
		
		// TODO Auto-generated method stub
		
	}

}
