package com.mmmm.entity;

import java.io.Serializable;

/**
 * 考试列表实体类
 * @author Noor
 *
 */
public class ExamList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int userId;
	
	private String score;

	private String examDate;
	
	private int state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ExamList [id=" + id + ", userId=" + userId + ", score=" + score + ", examDate=" + examDate + ", state="
				+ state + "]";
	}
	
	
}
