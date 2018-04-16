package com.mmmm.entity;

import java.io.Serializable;

/**
 * 登陆角色的实体类
 * @author Noor
 *
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String loginName;
	
	private int role;
	

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", loginName=" + loginName + ", role="
				+ role + ", state=" + state + "]";
	}
	
	

}
