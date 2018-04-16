package com.mmmm.mapper;


import com.mmmm.entity.FormalExam;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;

/**
 * 用户登陆的mapper
 * 
 * @author Noor
 *
 */
public interface LoginMapper {

	// 根据用户名获取用户信息
	User getUserByUsername(String username);

	// 根据用户id获取用户等级
	Grade getGradeByUserId(int userid);

	FormalExam getFormalExamByUserId(int id);
}
