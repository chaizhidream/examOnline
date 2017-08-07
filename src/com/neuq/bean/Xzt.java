package com.neuq.bean;

import java.io.Serializable;


/**
 * 选择题类
 */
public class Xzt implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String question;
	private String answer;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private int questiontype;
	private String questionpoint;
	
	public Xzt() {
		// TODO 自动生成的构造函数存根
		this.questiontype = 1;
	}
		
  /**
	 * @param question 选择题题干
	 * @param answer 选择题答案选择
	 * @param optionA 选项A
	 * @param optionB 选项B
	 * @param optionC 选项C
	 * @param optionD 选项D
     * @param questiontype  题目类型（选择题）
	 * @param questionpoint  题目知识点
	 */
	public Xzt(String question, String answer, String optionA, String optionB, String optionC, String optionD,
			 String questionpoint) {
		super();
		this.question = question;
		this.answer = answer;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.questiontype = 1;
		this.questionpoint = questionpoint;
	}




    @Override
public String toString() {
	return "Xzt [id=" + id + ", question=" + question + ", answer=" + answer + ", optionA=" + optionA + ", optionB="
			+ optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", questiontype=" + questiontype
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
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
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
