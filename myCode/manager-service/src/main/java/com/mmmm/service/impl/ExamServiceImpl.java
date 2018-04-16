package com.mmmm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.Exam;
import com.mmmm.entity.ExamList;
import com.mmmm.entity.ExamQuestion;
import com.mmmm.entity.Grade;
import com.mmmm.entity.Questions;
import com.mmmm.entity.User;
import com.mmmm.mapper.ExamMapper;
import com.mmmm.service.ExamService;

/**
 * 关于考试的Service
 * 
 * @author Noor
 *
 */

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamMapper ExamMapper;

	// 获取用户试题
	@Override
	public Map<String, Object> getQuestionList(String grade) {
		// 根据用户等级获取试题
		List<Exam> examList = ExamMapper.selectByExamGrade(grade);
		// 获取本等级所有试题,随机取一套
		Random random = new Random();
		int examNum = random.nextInt(examList.size());
		Exam Exam = examList.get(examNum);
		// 根据选取的试题获取试题的题目ID返回
		List<ExamQuestion> questionsId = ExamMapper.getQuestionsID(Exam.getExamId());
		// 根据题目ID获取所有的试题内容 Ch多选 Ju判断 Ra单选
		List<Questions> ChquestionList = new ArrayList<>();
		List<Questions> JuquestionList = new ArrayList<>();
		List<Questions> RaquestionList = new ArrayList<>();
		for (int i = 0; i < questionsId.size(); i++) {
			Questions quertionContent = ExamMapper.getQuestionContent(questionsId.get(i).getQuestionId());
			if (quertionContent.getQuesId().substring(0, 2).equals("CH")) {
				ChquestionList.add(quertionContent);
			}
			if (quertionContent.getQuesId().substring(0, 2).equals("JU")) {
				JuquestionList.add(quertionContent);
			}
			if (quertionContent.getQuesId().substring(0, 2).equals("RA")) {
				RaquestionList.add(quertionContent);
			}
			System.out.println(quertionContent);
		}
		Map<String, Object> result = new HashMap<>();
		result.put("ChquestionList", ChquestionList);
		result.put("JuquestionList", JuquestionList);
		result.put("RaquestionList", RaquestionList);
		return result;
	}

	// 根据返回的试题计算等级
	@Override
	public Map<String, Object> getNewGrade(User sessionUser, Grade sessionGrade, Integer achievement) {
		// 获取当前用户信息
		String userGrade = "N";
		if (achievement >= 0 && achievement < 6) {
			userGrade = "C";
		} else if (achievement >= 6 && achievement < 10) {
			userGrade = "B";
		} else if (achievement >= 10 && achievement <= 14) {
			userGrade = "A";
		} else {
			userGrade = "N";
		}
		System.out.println(achievement);

		// 存取考试信息
		Grade grade = new Grade();
		// ID
		grade.setId(sessionGrade.getId());
		// 用户
		grade.setUserId(sessionUser.getId());
		// 最后的成绩
		grade.setLastScore(achievement.toString());
		// 最后一次考试时间
		Date nowDate = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		grade.setLastExamDate(df.format(nowDate).toString());
		// 最好成绩比较
		if (StringUtils.isNotBlank(sessionGrade.getBestScore())) {
			Integer best_score = Integer.parseInt(sessionGrade.getBestScore());
			if (achievement > best_score) {
				grade.setBestScore(achievement.toString());
				grade.setBestExamDate(df.format(nowDate).toString());
			}else {
				grade.setBestScore(sessionGrade.getBestScore());
				grade.setBestExamDate(sessionGrade.getBestExamDate());
			}
		}else {
			grade.setBestScore(achievement.toString());
			grade.setBestExamDate(df.format(nowDate).toString());
		}
		grade.setGrade(userGrade);
		grade.setExamGrade(userGrade);
		grade.setState("1");

		System.out.println(grade);
		
		// 修改数据库信息
		int updateByPrimaryKey = ExamMapper.updateByPrimaryKey(grade);
		
		// 往考试列表表里添加考试成绩
		ExamList examList = new ExamList();
		examList.setUserId(sessionUser.getId());
		examList.setScore(achievement.toString());
		examList.setExamDate(df.format(nowDate).toString());
		examList.setState(1);
		
		int insertExamToExamList = ExamMapper.insertExamToExamList(examList);
		
		Map<String, Object> result = new HashMap<>();
		if (updateByPrimaryKey > 0 && insertExamToExamList > 0) {
			result.put("msg","更新成功");
		}else {
			result.put("msg","更新失败");
		}
		result.put("newgrade", grade);
		return result;
	}

	// 获取用户所有的考试记录
	@Override
	public List<ExamList> getExamListByUserId(int userId) {
		return ExamMapper.getExamListByUserId(userId);
	}

}
