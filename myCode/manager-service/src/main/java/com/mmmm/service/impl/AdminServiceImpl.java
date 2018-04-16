package com.mmmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmmm.entity.Menu;
import com.mmmm.entity.User;
import com.mmmm.mapper.AdminMapper;
import com.mmmm.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	// 获取菜单
	@Override
	public List<Menu> getMenu() {
		return adminMapper.getMenu();
	}

	// 获取全部普通用户
	@Override
	public List<User> showUser() {
		return adminMapper.showUser();
	}
	
	//  添加用户
	@Override
	public int addUser(User user) {
		adminMapper.addGrade(user.getId());
		return adminMapper.addUser(user);
	}

	// 删除用户
	@Override
	public void deleteUser(String ids) {
		String[] split = ids.split(",");
		for (int i = 0; i < split.length; i++) {
			int id = Integer.parseInt(split[i]);
			adminMapper.deleteUser(id);
			adminMapper.deleteGradeByUserId(id);
			adminMapper.deleteExamListByUserId(id);
			adminMapper.deleteFormalExamByUserId(id);
		}
	}

	// 更改用户
	@Override
	public void exitUser(User user) {
		adminMapper.exitUser(user);
	}
	
	// 获取管理员用户信息
	@Override
	public User adminUser() {
		return adminMapper.adminUser();
	}

}
