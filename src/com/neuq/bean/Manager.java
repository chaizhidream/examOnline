package com.neuq.bean;

import java.io.Serializable;

/**
 * 管理员类
 */
public class Manager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String managername;
	private String pwd;
	private String name;
	private char sex;
	private String telephone;
	private String email;
	private int ru;
	
	public Manager() {
		// TODO 自动生成的构造函数存根
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
	public Manager(String managername, String pwd, String name, char sex, String telephone, String email) {
		super();
		this.managername = managername;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 1;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru = ru;
	}
}
