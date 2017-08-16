package com.neuq.bean;

import java.io.Serializable;

/**
 * 教师类
 */
public class Teacher extends User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int ru=2;
	
	public int getRu() {
		return ru;
	}

	public void setRu(int ru) {
		this.ru = ru;
	}

	public Teacher() {
		this.ru = 2;
	}
	
	
	
	
	/**
	 * @param username 教师用户名
	 * @param pwd 教师密码
	 * @param name 教师姓名
	 * @param sex 教师性别
	 * @param telephone 教师电话
	 * @param email 教师邮箱
	 * @param ru 管理员权限1，教师权限2，学生3
	 */
	public Teacher(String username, String pwd, String name, String sex, String telephone, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 2;
	}

	
	
}
