package com.mmmm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmmm.entity.Menu;
import com.mmmm.entity.User;
import com.mmmm.service.AdminService;

/**
 * 管理员控制Controller
 * 
 * @author Noor
 *
 */
@Controller
@RequestMapping("/admin/*")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// 获取所有的菜单
	@RequestMapping("menuShow")
	@ResponseBody
	public List<Menu> menuShow() {
		return adminService.getMenu();
	}

	// 查看所有的用户
	@RequestMapping("showUser")
	@ResponseBody
	public List<User> showUser() {
		return adminService.showUser();
	}

	// 添加用户
	@RequestMapping("addUser")
	public String addUser(User user) {
		int adduser = adminService.addUser(user);
		if (adduser > 0) {
			return "/page/menupage/user.jsp";
		} else {
			return "/WEB-INF/jsp/web/404.jsp";
		}

	}

	// 删除用户
	@RequestMapping(value = "deleteUser", method = RequestMethod.GET)
	public String deleteUser(String ids) {
		adminService.deleteUser(ids);
		return "/page/menupage/user.jsp";
	}

	// 更改用户信息
	@RequestMapping("exitUser")
	public String exitUser(User userList) {
		adminService.exitUser(userList);
		if (userList.getId() == 1) {
			return "/page/menupage/adminuser_exit.jsp?userid=" + userList.getId() + "&loginName="
					+ userList.getLoginName() + "&name=" + userList.getName() + "&password=" + userList.getPassword()
					+ "&state=" + userList.getState();
		} else {
			return "/page/menupage/user.jsp";
		}
	}

	// 获取管理员的信息
	@RequestMapping("adminUser")
	public String adminUser() {
		User userList = adminService.adminUser();
		return "/page/menupage/adminuser_exit.jsp?userid=" + userList.getId() + "&loginName=" + userList.getLoginName()
				+ "&name=" + userList.getName() + "&password=" + userList.getPassword() + "&state="
				+ userList.getState();
	}
}
