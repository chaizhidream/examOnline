package com.neuq.bean;

import java.io.Serializable;

/**
 * 编程题类
 */
public class Bct implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String question;
	private int questiontype;
	private String questionpoint;
	
	public Bct() {
		// TODO 自动生成的构造函数存根
		this.questiontype = 3;
	}
		
	/**
	 * @param question 题目题干
	 * @param questiontype 题目类型（编程题）
	 * @param questionpoint 题目知识点
	 */
	public Bct(String question,  String questionpoint) {
		super();
		this.question = question;
		this.questiontype = 3;
		this.questionpoint = questionpoint;
	}




	@Override
	public String toString() {
		return "Bct [id=" + id + ", question=" + question + ", questiontype=" + questiontype + ", questionpoint="
				+ questionpoint + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	public String getQuestionpoint() {
		return questionpoint;
	}
	public void setQuestionpoint(String questionpoint) {
		this.questionpoint = questionpoint;
	}

}
