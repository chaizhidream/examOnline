package com.mmmm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mmmm.entity.FormalExam;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;
import com.mmmm.service.LoginService;

@Controller
@RequestMapping("/home/*")
public class LoginController {

	@Autowired
	private LoginService loginService;

	// 登陆页面
	@RequestMapping("loginPage")
	public String loginPage() {
		return "/WEB-INF/jsp/web/login.jsp";
	}

	// 验证登陆
	@RequestMapping("login")
	public String login(Model model, String username, String password,HttpServletRequest request) {
		// 要判断session里面有没有用户信息
		User sessionUser = (User) request.getSession().getAttribute("loginuser");
		Grade sessionGrade = (Grade) request.getSession().getAttribute("usergrade");
		
		System.out.println(sessionUser);
		System.out.println(sessionGrade);
		
		if(sessionUser != null) {
			request.getSession().setAttribute("msg", "欢迎回来~");
			// 判断用户的权限
			if (sessionUser.getRole() == 1) {
				// 管理员
				return "/WEB-INF/jsp/web/adminHomee.jsp";
			} else {
				// 考生
				return "/WEB-INF/jsp/web/home.jsp";
			}
		}else {
			// 获取当前用的用户名
			User loginUser = loginService.getUserByUsername(username);
			System.out.println(loginUser);
			// 根据用户id获取其成绩以及等级
			if(loginUser != null) {
				Grade userGrade = loginService.getGradeByUserId(loginUser.getId());
				// 根据用户id获取其考试成绩
				FormalExam formalExam = loginService.getFormalExamByUserId(loginUser.getId());
				System.out.println(userGrade);
				// 判断
				if (loginUser.getPassword().equals(password)) {
					
					request.getSession().setAttribute("msg", "登陆成功");
					request.getSession().setAttribute("loginuser", loginUser);
					
					// 判断用户的权限
					if (loginUser.getRole() == 1) {
						// 管理员
						return "/WEB-INF/jsp/web/adminHomee.jsp";
					} else {
						// 考生
						request.getSession().setAttribute("usergrade", userGrade);
						if(formalExam != null) {
							request.getSession().setAttribute("userFormalExam", formalExam.getScore());
						}else {
							request.getSession().setAttribute("userFormalExam", "无考试成绩");
						}
						return "/WEB-INF/jsp/web/home.jsp";
					}
				} else {
					model.addAttribute("msg", "账号或密码错误!");
					return "/WEB-INF/jsp/web/login.jsp";
				}
			}else {
				model.addAttribute("msg", "账号或密码错误!");
				return "/WEB-INF/jsp/web/login.jsp";
			}
		}
	}
	
	// 用户的登出
	@RequestMapping("logOut")
	public String logOut(HttpSession session){
		session.invalidate();
		return "/WEB-INF/jsp/web/login.jsp";
	}
}
