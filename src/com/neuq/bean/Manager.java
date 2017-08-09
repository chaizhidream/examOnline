package com.neuq.bean;

import java.io.Serializable;

/**
 * 管理员类
 */
public class Manager extends User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int ru=1;
	
	public int getRu() {
		return ru;
	}

	public void setRu(int ru) {
		this.ru = ru;
	}


	
	public Manager() {
		this.ru = 1;
	}
	
	
	/**
	 * @param managername 管理员用户名
	 * @param pwd 管理员密码
	 * @param name 管理员姓名
	 * @param sex 管理员性别
	 * @param telephone 管理员电话
	 * @param email 管理员邮箱
	 * @param ru 管理员权限1，教师权限2，学生3
	 */
	public Manager(String username, String pwd, String name, String sex, String telephone, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 1;
	}
	
	
	
}
