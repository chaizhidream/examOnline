package com.mmmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.service.CheckService;

/**
 * 校验各种id的controller
 * 
 * @author Noor
 *
 */
@Controller
@RequestMapping("/check/*")
public class CheckController {

	@Autowired
	private CheckService CheckService;

	// 校验用户学号
	@RequestMapping("checkUserId")
	@ResponseBody
	public String checkUserId(Integer userid) {
		return CheckService.checkUserId(userid);
	}

	// 校验用户的登陆名
	@RequestMapping("checkLoginName")
	@ResponseBody
	public String checkLoginName(String loginName) {
		return CheckService.checkLoginName(loginName);
	}

	// 校验题目的编号
	@RequestMapping("checkQuestionId")
	@ResponseBody
	public String checkQuestionId(String quesId) {
		return CheckService.checkQuestionId(quesId);
	}

	// 校验试题的编号
	@RequestMapping("checkExamId")
	@ResponseBody
	public String checkExamId(String examId) {
		return CheckService.checkexamIdId(examId);
	}
}
