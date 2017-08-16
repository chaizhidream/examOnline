package com.neuq.bean;

import java.io.Serializable;

/**
 * 学生成绩类
 */
public class StudentGrade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;	
	private String username;
	private int xztscore;
	private int tktscore;
	private int bctscore=-1;
	private String papername;
	
	
	
	
   
	/**
	 * @param username 学生用户名	
	 * @param score 学生成绩
	 * @param papername 试卷名
	 */
	public StudentGrade(String username, int xztscore,int tktscore, String papername) {
		super();
		this.username = username;
		this.xztscore=xztscore;
		this.tktscore=tktscore;
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

	 public int getXztscore() {
			return xztscore;
		}
		public void setXztscore(int xztscore) {
			this.xztscore = xztscore;
		}
		public int getTktscore() {
			return tktscore;
		}
		public void setTktscore(int tktscore) {
			this.tktscore = tktscore;
		}
		public int getBctscore() {
			return bctscore;
		}
		public void setBctscore(int bctscore) {
			this.bctscore = bctscore;
		}
	
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}

	@Override
	public String toString() {
		return "StudentGrade [id=" + id + ", username=" + username + ", xztscore=" + xztscore + ", tktscore=" + tktscore
				+ ", bctscore=" + bctscore + ", papername=" + papername + "]";
	}
	
	
}
