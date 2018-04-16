package com.mmmm.service;

import java.util.Map;

import com.mmmm.entity.User;

public interface FormalExamService {

	Map<String, Object> getFormalExam(User sessionUser);

	Map<String, Object> getSelfExam();

	Map<String, Object> setformalScore(User sessionUser, Integer achievement);

}
