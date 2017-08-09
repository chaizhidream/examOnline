package com.neuq.bean;

import java.io.Serializable;

public abstract class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	protected  int id;
	protected  String username;
	protected  String pwd;
	protected  String name;
	protected  String sex;
	protected  String studentclass;
	protected  String telephone;
	protected  String email;
	
	//默认权限为3，学生权限
	protected int ru = 3;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
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
