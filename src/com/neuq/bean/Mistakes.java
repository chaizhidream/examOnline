package com.neuq.bean;

import java.io.Serializable;

/**
 * 错题集类
 */
public class Mistakes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private int questiontype;
	private int questionid;
	
	
	public Mistakes() {
		// TODO 自动生成的构造函数存根
	}
	
	
	/**
	 * @param username 学生用户名
	 * @param questiontype 题目类型（选择题、填空题、编程题）
	 * @param questionid 问题ID
	 */
	public Mistakes(String username, int questiontype, int questionid) {
		super();
		this.username = username;
		this.questiontype = questiontype;
		this.questionid = questionid;
	}
	
	
	
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
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	
	
}
