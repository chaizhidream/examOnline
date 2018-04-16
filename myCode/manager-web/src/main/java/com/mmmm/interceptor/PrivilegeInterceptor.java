package com.mmmm.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mmmm.entity.User;

public class PrivilegeInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//如果是系统管理员登陆，则不拦截。
		HttpSession session = request.getSession(false);//直接访问jsp会创建session，看work目录反编译后的对应jsp（第一次访问request.getSession()会创建session）
		if(session != null){
			User user = (User) session.getAttribute("loginuser");
			if (user != null && "admin".equals(user.getLoginName())) {
				return true;
			}
		}
		//如果当前用户未登陆，则拦截。
		if(session == null || session.getAttribute("loginuser") == null){
			response.sendRedirect("/manager-web");
			return false;
		}
		
		return true;
	}
}
