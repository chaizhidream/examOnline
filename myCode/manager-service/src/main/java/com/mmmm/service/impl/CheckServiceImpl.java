package com.mmmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;
import com.mmmm.entity.User;
import com.mmmm.mapper.CheckMapper;
import com.mmmm.service.CheckService;

@Service
public class CheckServiceImpl implements CheckService {

	@Autowired
	private CheckMapper CheckMapper;
	
	// 校验试题id
	@Override
	public String checkQuestionId(String quesId) {
		List<Questions> questionslist = CheckMapper.checkQuestionId();
		for (Questions questions : questionslist) {
			if(quesId.equals(questions.getQuesId())) {
				return "false";
			}
		}
		return "true";
	}

	@Override
	public String checkUserId(Integer userid) {
		List<User> useridslist = CheckMapper.checkUser();
		for (User questions : useridslist) {
			if(userid == questions.getId()) {
				return "false";
			}
		}
		return "true";
	}

	@Override
	public String checkLoginName(String loginName) {
		List<User> loginNamelist = CheckMapper.checkUser();
		for (User questions : loginNamelist) {
			if(loginName.equals(questions.getLoginName())) {
				return "false";
			}
		}
		return "true";
	}

	@Override
	public String checkexamIdId(String examId) {
		List<Exam> loginNamelist = CheckMapper.checkExam();
		for (Exam questions : loginNamelist) {
			if(examId.equals(questions.getExamId())) {
				return "false";
			}
		}
		return "true";
	}

}
