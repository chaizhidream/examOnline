package com.mmmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;
import com.mmmm.mapper.AdminExamMapper;
import com.mmmm.service.AdminExamService;

@Service
public class AdminExamServiceImpl implements AdminExamService {

	@Autowired
	private AdminExamMapper adminExamMapper;
	
	// 获取所有自测试题
	@Override
	public List<Exam> showExam() {
		return adminExamMapper.showExam();
	}
	
	// 获取题库
	@Override
	public List<Questions> showQuestions() {
		return adminExamMapper.showQuestions();
	}

	// 获取考试题
	@Override
	public List<Exam> showFormalExam() {
		return adminExamMapper.showFormalExam();
	}

	// 添加题目
	@Override
	public int addQuestions(Questions questions) {
		return adminExamMapper.addQuestions(questions);
	}
	
	// 删除题目
	@Override
	public void deleteQuestion(String quesId) {
		String[] split = quesId.split(",");
		for (int i = 0; i < split.length; i++) {
			adminExamMapper.deleteQuestion(split[i]);
		}
	}

	// 添加试题
	@Override
	public int addExam(Exam exam) {
		return adminExamMapper.addExam(exam);
	}

	// 删除试题
	@Override
	public void deleteExam(String quesId) {
		String[] split = quesId.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			adminExamMapper.deleteExam(split[i]);
			adminExamMapper.deleteExamQuestion(split[i]);
		}
	}

	// 获取试题内容
	@Override
	public List<Questions> lookExam(String examid) {
		// 获取试题所关联的题目
		return adminExamMapper.getQuestion(examid);
	}
	
	// 关联试题和题目
	@Override
	public void linkQuestions(String questionIds, String examId) {
		// 清空原有的试题
		adminExamMapper.deleteExamQuestion(examId);
		String[] split = questionIds.split(",");
		for (int i = 0; i < split.length; i++) {
			adminExamMapper.linkQuestions(examId,split[i]);
		}
		
	}

	// 设为考题
	@Override
	public int exitformalExamId(String examid) {
		return adminExamMapper.exitformalExamId(examid);
	}
}
