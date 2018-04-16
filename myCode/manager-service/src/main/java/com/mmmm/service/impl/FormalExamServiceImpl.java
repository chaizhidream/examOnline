package com.mmmm.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.ExamQuestion;
import com.mmmm.entity.FormalExam;
import com.mmmm.entity.Questions;
import com.mmmm.entity.User;
import com.mmmm.mapper.ExamMapper;
import com.mmmm.mapper.FormalExamMapper;
import com.mmmm.service.FormalExamService;

/**
 * 用户正式考试的service
 * 
 * @author Noor
 *
 */
@Service
public class FormalExamServiceImpl implements FormalExamService {

	@Autowired
	private FormalExamMapper formalExamMapper;
	
	@Autowired
	private ExamMapper ExamMapper;

	// 获取用户考试的
	@Override
	public Map<String, Object> getFormalExam(User sessionUser) {
		Map<String, Object> result = new HashMap<String, Object>();
		// 先根据当前用户 查询是考试成绩
		FormalExam formalExam = formalExamMapper.getFormalExamByUserId(sessionUser.getId());
		// 判断
		if(formalExam == null) {
			result.put("msg","还没考");
		}else {
			result.put("msg","考完了");
			result.put("data", formalExam);
		}
		return result;
	}

	@Override
	public Map<String, Object> getSelfExam() {
		// 获取考试题编号
		String examId = ExamMapper.getExamId();
		// 根据选取的试题获取试题的题目ID返回
		List<ExamQuestion> questionsId = ExamMapper.getQuestionsID(examId);
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

	// 正式考试的成绩
	@Override
	public Map<String, Object> setformalScore(User sessionUser, Integer achievement) {
		// 保存考试成绩
		FormalExam formalExam = new FormalExam();
		formalExam.setUserId(sessionUser.getId());
		formalExam.setScore(achievement.toString());
		Date nowDate = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formalExam.setExamDate(df.format(nowDate).toString());
		formalExam.setExamType(1);
		formalExam.setState(1);
		
		int insertFormalExam = formalExamMapper.insertFormalExam(formalExam);
		
		Map<String, Object> result = new HashMap<>();
		if (insertFormalExam > 0) {
			result.put("msg","更新成功");
		}else {
			result.put("msg","更新失败");
		}
		result.put("formalExam", achievement);
		return result;
	}

}
