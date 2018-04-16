package com.mmmm.service;

import java.util.List;

import com.mmmm.entity.Menu;
import com.mmmm.entity.User;

public interface AdminService {

	List<Menu> getMenu();

	List<User> showUser();

	int addUser(User user);

	void deleteUser(String ids);

	void exitUser(User user);

	User adminUser();

}
