package com.mmmm.mapper;

import java.util.List;

import com.mmmm.entity.Menu;
import com.mmmm.entity.User;

public interface AdminMapper {

	List<Menu> getMenu();

	List<User> showUser();

	int addUser(User user);

	void deleteUser(Integer id);
	
	void deleteGradeByUserId(Integer id);
	
	void deleteExamListByUserId(Integer id);
	
	void deleteFormalExamByUserId(Integer id);

	void exitUser(User user);

	User adminUser();

	void addGrade(int id);

}
