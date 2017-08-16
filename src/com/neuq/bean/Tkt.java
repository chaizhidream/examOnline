package com.neuq.bean;

import java.io.Serializable;


/**
 * 填空题类
 */
public class Tkt implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int id;	
	private String question;
	private String answer;
	private int questiontype;
	private String questionpoint;
	
	public Tkt() {
		// TODO 自动生成的构造函数存根
		this.questiontype = 2;
	}
	
	
	
    /**
	 * @param question 填空题题干
	 * @param answer 填空题答案
	 * @param questiontype  题目类型（填空题）
	 * @param questionpoint  题目知识点
	 */
	public Tkt(String question, String answer, String questionpoint) {
		super();
		this.question = question;
		this.answer = answer;
		this.questiontype = 2;
		this.questionpoint = questionpoint;
	}



	@Override
	public String toString() {
		return "Tkt [id=" + id + ", question=" + question + ", answer=" + answer + ", questiontype=" + questiontype
				+ ", questionpoint=" + questionpoint + "]";
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
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
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
