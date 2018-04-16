package com.mmmm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;
import com.mmmm.service.AdminExamService;

/**
 * 管理考试的controller
 * 
 * @author Noor
 *
 */

@Controller
@RequestMapping("/adminExam/*")
public class AdminExamController {

	@Autowired
	private AdminExamService adminExamService;

	// 获取所有自测试题
	@RequestMapping("showExam")
	@ResponseBody
	public List<Exam> showExam() {
		return adminExamService.showExam();
	}

	// 获取考试试题
	@RequestMapping("showFormalExam")
	@ResponseBody
	public List<Exam> showFormalExam() {
		return adminExamService.showFormalExam();
	}

	// 获取题库题目
	@RequestMapping("showQuestions")
	@ResponseBody
	public List<Questions> showQuestions() {
		return adminExamService.showQuestions();
	}

	// 添加题目
	@RequestMapping("addQuestions")
	public String addQuestions(Questions questions) {
		int addQuestions = adminExamService.addQuestions(questions);
		if (addQuestions > 0) {
			return "/page/menupage/questionList.jsp";
		} else {
			return "/WEB-INF/jsp/web/404.jsp";
		}
	}

	// 删除题目
	@RequestMapping(value = "deleteQuestions", method = RequestMethod.GET)
	public String deleteUser(String ids) {
		adminExamService.deleteQuestion(ids);
		return "/page/menupage/questionList.jsp";
	}

	// 添加试题
	@RequestMapping("addExam")
	public String addExam(Exam exam) {
		int addQuestions = adminExamService.addExam(exam);
		if (addQuestions > 0) {
			if("Z".equals(exam.getExamGrade())) {
				return "/page/menupage/formalexamList.jsp";
			}else {
				return "/page/menupage/examList.jsp";
			}
		} else {
			return "/WEB-INF/jsp/web/404.jsp";
		}
	}

	// 删除试题
	@RequestMapping(value = "deleteExam", method = RequestMethod.GET)
	public String deleteExam(String ids ,String examGrade) {
		adminExamService.deleteExam(ids);
		if("Z".equals(examGrade)) {
			return "/page/menupage/formalexamList.jsp";
		}else {
			return "/page/menupage/examList.jsp";
		}
	}

	// 获取试题内容
	@RequestMapping(value = "lookExam")
	@ResponseBody
	public List<Questions> lookExam(String examid) {
		return adminExamService.lookExam(examid);
	}
	
	// 关联题目
	@RequestMapping(value = "linkQuestions", method = RequestMethod.GET)
	public String linkQuestions(String questionIds ,String examId,String examGrade) {
		adminExamService.linkQuestions(questionIds,examId);
		if("Z".equals(examGrade)) {
			return "/page/menupage/formalexamList.jsp";
		}else {
			return "/page/menupage/examList.jsp";
		}
	}
	// 修改考试题目
	@RequestMapping("exitformalExamId")
	@ResponseBody
	public String exitformalExamId(String examid) {
		int update = adminExamService.exitformalExamId(examid);
		if(update > 0) {
			return "666";
		}else {
			return "999";
		}
	}

}
