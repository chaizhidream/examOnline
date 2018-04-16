package com.mmmm.entity;

import java.io.Serializable;

/**
 * 用户成绩的实体类
 * 
 * @author Noor
 *
 */
public class Grade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private int userId;

	private String lastScore;

	private String lastExamDate;

	private String bestScore;

	private String bestExamDate;

	private String grade;

	private String examGrade;

	private String state;

	@Override
	public String toString() {
		return "Grade [id=" + id + ", userId=" + userId + ", lastScore=" + lastScore + ", lastExamDate=" + lastExamDate
				+ ", bestScore=" + bestScore + ", bestExamDate=" + bestExamDate + ", grade=" + grade + ", examGrade="
				+ examGrade + ", state=" + state + "]";
	}

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

	public String getLastScore() {
		return lastScore;
	}

	public void setLastScore(String lastScore) {
		this.lastScore = lastScore;
	}

	public String getLastExamDate() {
		return lastExamDate;
	}

	public void setLastExamDate(String lastExamDate) {
		this.lastExamDate = lastExamDate;
	}

	public String getBestScore() {
		return bestScore;
	}

	public void setBestScore(String bestScore) {
		this.bestScore = bestScore;
	}

	public String getBestExamDate() {
		return bestExamDate;
	}

	public void setBestExamDate(String bestExamDate) {
		this.bestExamDate = bestExamDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getExamGrade() {
		return examGrade;
	}

	public void setExamGrade(String examGrade) {
		this.examGrade = examGrade;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	
}
