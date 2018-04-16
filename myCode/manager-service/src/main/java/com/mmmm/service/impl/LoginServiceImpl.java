package com.mmmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.FormalExam;
import com.mmmm.entity.Grade;
import com.mmmm.entity.User;
import com.mmmm.mapper.LoginMapper;
import com.mmmm.service.LoginService;

/**
 * 登陆的Service
 * @author Noor
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
		

	// 根据用户名获取当前用户
	@Override
	public User getUserByUsername(String username) {
		return loginMapper.getUserByUsername(username);
	}


	// 获取等级
	@Override
	public Grade getGradeByUserId(int id) {
		return loginMapper.getGradeByUserId(id);
	}


	@Override
	public FormalExam getFormalExamByUserId(int id) {
		return loginMapper.getFormalExamByUserId(id);
	}

}
