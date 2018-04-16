package com.mmmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.ShowScore;
import com.mmmm.mapper.AdminScoreMapper;
import com.mmmm.service.AdminScoreService;

@Service
public class AdminScoreServiceImpl implements AdminScoreService {

	@Autowired
	private AdminScoreMapper AdminScoreMapper;
	
	// 获取用户的自测成绩
	@Override
	public List<ShowScore> showScore() {
		return AdminScoreMapper.showScore();
	}

	// 获取所有考试成绩
	@Override
	public List<ShowScore> showFormalScore() {
		return AdminScoreMapper.showFormalScore();
	}

}
