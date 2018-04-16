package com.mmmm.entity;

import java.io.Serializable;

/**
 * 试题的实体类
 * @author Noor
 *
 */
public class Exam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int ID;
	
	private String examId;
	
	private String examName;
	
	private String examGrade;
	
	private int state;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamGrade() {
		return examGrade;
	}

	public void setExamGrade(String examGrade) {
		this.examGrade = examGrade;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Exam [ID=" + ID + ", examId=" + examId + ", examName=" + examName + ", examGrade=" + examGrade
				+ ", state=" + state + "]";
	}
	
	

}
