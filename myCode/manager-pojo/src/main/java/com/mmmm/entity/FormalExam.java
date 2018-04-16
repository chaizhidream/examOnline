package com.mmmm.entity;

import java.io.Serializable;

/**
 * 真是考试的实体类
 * @author Noor
 *
 */
public class FormalExam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int userId;
	
	private String score;
	
	private String examDate;
	
	private int examType;
	
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

	public int getExamType() {
		return examType;
	}

	public void setExamType(int examType) {
		this.examType = examType;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "FormalExam [id=" + id + ", userId=" + userId + ", score=" + score + ", examDate=" + examDate
				+ ", examType=" + examType + ", state=" + state + "]";
	}
	
	

}
