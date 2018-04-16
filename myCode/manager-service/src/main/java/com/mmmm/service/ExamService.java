package com.mmmm.service;

import java.util.List;
import java.util.Map;

import com.mmmm.entity.ExamList;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;

public interface ExamService {

	Map<String, Object> getNewGrade(User sessionUser, Grade sessionGrade, Integer achievement);

	Map<String, Object> getQuestionList(String grade);

	List<ExamList> getExamListByUserId(int id);

}
