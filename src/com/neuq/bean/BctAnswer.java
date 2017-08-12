package com.neuq.bean;

import java.io.Serializable;

public class BctAnswer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String papername;
	private String answerpath1;
	private String answerpath2;
	
	public BctAnswer() {
		// TODO 自动生成的构造函数存根
	}
	
	/**
	 * @param username
	 * @param papername
	 * @param answerpath1
	 * @param answerpath2
	 */
	public BctAnswer(String username, String papername, String answerpath1, String answerpath2) {
		super();
		this.username = username;
		this.papername = papername;
		this.answerpath1 = answerpath1;
		this.answerpath2 = answerpath2;
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
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public String getAnswerpath1() {
		return answerpath1;
	}
	public void setAnswerpath1(String answerpath1) {
		this.answerpath1 = answerpath1;
	}
	public String getAnswerpath2() {
		return answerpath2;
	}
	public void setAnswerpath2(String answerpath2) {
		this.answerpath2 = answerpath2;
	}
	@Override
	public String toString() {
		return "BctAnswer [id=" + id + ", username=" + username + ", papername=" + papername + ", answerpath1="
				+ answerpath1 + ", answerpath2=" + answerpath2 + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
