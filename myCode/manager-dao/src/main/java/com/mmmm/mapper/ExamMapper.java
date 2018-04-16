package com.mmmm.mapper;

import java.util.List;

import com.mmmm.entity.Exam;
import com.mmmm.entity.ExamList;
import com.mmmm.entity.ExamQuestion;
import com.mmmm.entity.Grade;
import com.mmmm.entity.Questions;

/**
 * 试题的Mapper
 * @author Noor
 *
 */
public interface ExamMapper {


	// 测试获取等级对应的全部试题
	List<Exam> selectByExamGrade(String examGrade);
	
	// 根据试题id获取试题对应的题目集合
	List<ExamQuestion> getQuestionsID(String examID);
	
	// 根据试题id获取试题内容
	Questions getQuestionContent(String questionID);
	
	// 修改考试信息
	int updateByPrimaryKey(Grade grade);
	
	// 添加考试信息到考试列表种
	int insertExamToExamList(ExamList examList);

	// 获取用户的所有的考试记录
	List<ExamList> getExamListByUserId(int userId);

	// 666
	String getExamId();
}
