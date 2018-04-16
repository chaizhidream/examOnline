package com.mmmm.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.entity.User;
import com.mmmm.service.FormalExamService;

/**
 * 用户正式考试的controller
 * 
 * @author Noor
 *
 */
@Controller
@RequestMapping("/formal/*")
public class FormalExamController {

	@Autowired
	private FormalExamService formalExamService;

	// 判断用户是否已经考过试
	@RequestMapping("getFormalExam")
	@ResponseBody
	public Map<String, Object> getFormalExam(HttpServletRequest request) {
		// 获取当前登陆的用户
		User sessionUser = (User) request.getSession().getAttribute("loginuser");
		return formalExamService.getFormalExam(sessionUser);
	}

	// 获取正式的考试题
	@RequestMapping("selfExam")
	public String getSelfExam(Model model) {
		Map<String, Object> mapResult = formalExamService.getSelfExam();
		// 返回所有的试题
		model.addAttribute("RaquestionList", mapResult.get("RaquestionList"));
		model.addAttribute("ChquestionList", mapResult.get("ChquestionList"));
		model.addAttribute("JuquestionList", mapResult.get("JuquestionList"));
		model.addAttribute("examtype", "formal");
		// 返回考试页面
		return "/WEB-INF/jsp/web/exam.jsp";
	}

	// 获取用户分数
	@RequestMapping("examAnList")
	@ResponseBody
	public String examAnList(Integer achievement, HttpServletRequest request) {
		// 获取当前用的用户名以及等级信息
		User sessionUser = (User) request.getSession().getAttribute("loginuser");
		System.out.println(sessionUser);
		// 处理考试成绩
		Map<String, Object> result = formalExamService.setformalScore(sessionUser, achievement);
		// 重新往session存取当前考试成绩
		request.getSession().setAttribute("userFormalExam", result.get("formalExam"));
		if (result.get("msg").equals("更新成功")) {
			return "/WEB-INF/jsp/web/home.jsp";
		} else {
			return "/WEB-INF/jsp/web/404.jsp";
		}
	}
}
