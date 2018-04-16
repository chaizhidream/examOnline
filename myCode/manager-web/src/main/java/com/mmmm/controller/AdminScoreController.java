package com.mmmm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理考试成绩的Controller
 * @author Noor
 *
 */
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.entity.ShowScore;
import com.mmmm.service.AdminScoreService;

@Controller
@RequestMapping("/adminScore/*")
public class AdminScoreController {

	@Autowired
	private AdminScoreService adminScoreService;

	// 获取所有自测的成绩
	@RequestMapping("showScore")
	@ResponseBody
	public List<ShowScore> showScore() {
		return adminScoreService.showScore();
	}

	// 获取所有考试的成绩
	@RequestMapping("showFormalScore")
	@ResponseBody
	public List<ShowScore> showFormalScore() {
		return adminScoreService.showFormalScore();
	}
}
