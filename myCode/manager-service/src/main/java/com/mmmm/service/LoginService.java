package com.mmmm.service;

import com.mmmm.entity.FormalExam;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;

public interface LoginService {

	// 获取用户信息
	User getUserByUsername(String username);

	// 获取用户等级
	Grade getGradeByUserId(int id);

	// 获取用户考试成绩
	FormalExam getFormalExamByUserId(int id);
}
