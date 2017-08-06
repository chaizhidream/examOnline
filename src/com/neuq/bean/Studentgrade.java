package com.neuq.bean;

import java.io.Serializable;

/**
 * 学生成绩类
 */
public class StudentGrade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;	
	private String username;
	private int score;
	private String papername;
	
	
	
	
    /**
	 * @param username 学生用户名	
	 * @param score 学生成绩
	 * @param papername 试卷名
	 */
	public StudentGrade(String username, int score, String papername) {
		super();
		this.username = username;
		this.score = score;
		this.papername = papername;
	}
	public StudentGrade() {
		// TODO Auto-generated constructor stub
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
}
