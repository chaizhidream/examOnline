package com.mmmm.entity;

import java.io.Serializable;

/**
 * 展示成绩的
 * @author Noor
 *
 */
public class ShowScore implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userId;
	
	private String userName;
	
	private String score;

	private String examDate;
	
	private String state;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "ShowScore [userId=" + userId + ", userName=" + userName + ", score=" + score + ", examDate=" + examDate
				+ ", state=" + state + "]";
	}
	
	

}
