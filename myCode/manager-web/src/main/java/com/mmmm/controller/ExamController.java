package com.mmmm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.entity.ExamList;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;
import com.mmmm.service.ExamService;

/*
 * 用户自测的Controller
 */
@Controller
@RequestMapping("/exam/*")
public class ExamController {

	@Autowired
	private ExamService ExamService;

	// 用户自测获取题目
	@RequestMapping("selfTest")
	public String userSelfTest(@RequestParam(value = "grade") String grade, Model model) {

		Map<String, Object> mapResult = ExamService.getQuestionList(grade);
		// 返回所有的试题
		model.addAttribute("RaquestionList", mapResult.get("RaquestionList"));
		model.addAttribute("ChquestionList", mapResult.get("ChquestionList"));
		model.addAttribute("JuquestionList", mapResult.get("JuquestionList"));
		model.addAttribute("examtype","self");
		// 返回考试页面
		return "/WEB-INF/jsp/web/exam.jsp";
	}

	// 获取用户填写的试题内容以及答案 并判断分数
	@RequestMapping("examAnList")
	@ResponseBody
	public String examAnList(Integer achievement, HttpServletRequest request) {
		// 获取当前用的用户名以及等级信息
		User sessionUser = (User) request.getSession().getAttribute("loginuser");
		Grade sessionGrade = (Grade) request.getSession().getAttribute("usergrade");
		System.out.println(sessionUser);
		// 处理考试成绩
		Map<String, Object> result = ExamService.getNewGrade(sessionUser, sessionGrade, achievement);
		// 重新往session中存取当前用户的考试等级
		request.getSession().setAttribute("usergrade", result.get("newgrade"));
		if (result.get("msg").equals("更新成功")) {
			return "/WEB-INF/jsp/web/home.jsp";
		} else {
			return "/WEB-INF/jsp/web/404.jsp";
		}
	}
	
	@RequestMapping("404")
	public String toError() {
		return "/WEB-INF/jsp/web/404.jsp";
	}

	// 获取用户的考试列表
	@RequestMapping("examList")
	@ResponseBody
	public List<ExamList> examList(HttpServletRequest request) {
		// 获取当前登陆的用户
		User sessionUser = (User) request.getSession().getAttribute("loginuser");
		// 获取
		List<ExamList> list = ExamService.getExamListByUserId(sessionUser.getId());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}

}
