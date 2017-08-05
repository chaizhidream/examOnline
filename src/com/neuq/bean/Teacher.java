package com.neuq.bean;

import java.io.Serializable;

/**
 * 教师类
 */
public class Teacher implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;	
	private String teachername;
	private String pwd;
	private String name;
	private char sex;
	private String telephone;
	private String email;
	private int ru;
	
	
	public Teacher() {
		// TODO 自动生成的构造函数存根
	}
	
	
	
	
	/**
	 * @param teachername 教师用户名
	 * @param pwd 教师密码
	 * @param name 教师姓名
	 * @param sex 教师性别
	 * @param telephone 教师电话
	 * @param email 教师邮箱
	 * @param ru 管理员权限1，教师权限2，学生3
	 */
	public Teacher(String teachername, String pwd, String name, char sex, String telephone, String email) {
		super();
		this.teachername = teachername;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 2;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
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
