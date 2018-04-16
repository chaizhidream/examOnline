package com.mmmm.mapper;

import java.util.List;

import com.mmmm.entity.Exam;
import com.mmmm.entity.Questions;
import com.mmmm.entity.User;

public interface CheckMapper {

	List<Questions> checkQuestionId();

	List<User> checkUser();

	List<Exam> checkExam();


}
