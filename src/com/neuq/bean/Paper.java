package com.neuq.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 试卷类
 */
public class Paper implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private Date starttime;
	private Date endtime;
	private String papername;
	
	private int xzt1;
	private int xzt2;
	private int xzt3;
	
	private int xzt4;
	private int xzt5;
	private int xzt6;
	
	private int xzt7;
	private int xzt8;
	private int xzt9;
	
	private int xzt10;
	private int tkt1;
	private int tkt2;
	
	private int tkt3;
	private int tkt4;
	private int tkt5;
	
	private int bct1;
	private int bct2;

	public Paper() {

	}
	
	
	
	/**
	 * @param starttime 考试开始时间
	 * @param endtime 考试结束时间
	 * @param papername 试卷名
	 * @param xzt1 选择题1
	 * @param xzt2 选择题2
	 * @param xzt3 选择题3
	 * @param xzt4 选择题4
	 * @param xzt5 选择题5 
	 * @param xzt6 选择题6
	 * @param xzt3 选择题7
	 * @param xzt4 选择题8
	 * @param xzt5 选择题9 
	 * @param xzt6 选择题10
	 * @param tkt1 填空题1
	 * @param tkt2 填空题2
	 * @param tkt3 填空题3
	 * @param tkt4 填空题4
	 * @param tkt5 填空题5
	 * @param tkt6 填空题6
	 * @param bct1 编程题1
	 * @param bct2 编程题2
	 */
	public Paper(Date starttime, Date endtime, String papername, int xzt1, int xzt2, int xzt3, int xzt4, int xzt5,
			int xzt6, int xzt7,int xzt8,int xzt9,int xzt10,int tkt1, int tkt2, int tkt3, int tkt4, int tkt5, int bct1, int bct2) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.papername = papername;
		this.xzt1 = xzt1;
		this.xzt2 = xzt2;
		this.xzt3 = xzt3;
		this.xzt4 = xzt4;
		this.xzt5 = xzt5;
		this.xzt6 = xzt6;
		this.xzt7 = xzt7;
		this.xzt8 = xzt8;
		this.xzt9 = xzt9;
		this.xzt10 = xzt10;
		this.tkt1 = tkt1;
		this.tkt2 = tkt2;
		this.tkt3 = tkt3;
		this.tkt4 = tkt4;
		this.tkt5 = tkt5;
		this.bct1 = bct1;
		this.bct2 = bct2;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.util.Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public int getXzt1() {
		return xzt1;
	}
	public void setXzt1(int xzt1) {
		this.xzt1 = xzt1;
	}
	public int getXzt2() {
		return xzt2;
	}
	public void setXzt2(int xzt2) {
		this.xzt2 = xzt2;
	}
	public int getXzt3() {
		return xzt3;
	}
	public void setXzt3(int xzt3) {
		this.xzt3 = xzt3;
	}
	public int getXzt4() {
		return xzt4;
	}
	public void setXzt4(int xzt4) {
		this.xzt4 = xzt4;
	}
	public int getXzt5() {
		return xzt5;
	}
	public void setXzt5(int xzt5) {
		this.xzt5 = xzt5;
	}
	public int getXzt6() {
		return xzt6;
	}
	public void setXzt6(int xzt6) {
		this.xzt6 = xzt6;
	}
	
	public int getXzt7() {
		return xzt7;
	}



	public void setXzt7(int xzt7) {
		this.xzt7 = xzt7;
	}



	public int getXzt8() {
		return xzt8;
	}



	public void setXzt8(int xzt8) {
		this.xzt8 = xzt8;
	}



	public int getXzt9() {
		return xzt9;
	}



	public void setXzt9(int xzt9) {
		this.xzt9 = xzt9;
	}



	public int getXzt10() {
		return xzt10;
	}



	public void setXzt10(int xzt10) {
		this.xzt10 = xzt10;
	}
	public int getTkt1() {
		return tkt1;
	}
	public void setTkt1(int tkt1) {
		this.tkt1 = tkt1;
	}
	public int getTkt2() {
		return tkt2;
	}
	public void setTkt2(int tkt2) {
		this.tkt2 = tkt2;
	}
	public int getTkt3() {
		return tkt3;
	}
	public void setTkt3(int tkt3) {
		this.tkt3 = tkt3;
	}
	public int getTkt4() {
		return tkt4;
	}
	public void setTkt4(int tkt4) {
		this.tkt4 = tkt4;
	}
	public int getTkt5() {
		return tkt5;
	}
	public void setTkt5(int tkt5) {
		this.tkt5 = tkt5;
	}

	public int getBct1() {
		return bct1;
	}
	public void setBct1(int bct1) {
		this.bct1 = bct1;
	}
	public int getBct2() {
		return bct2;
	}
	public void setBct2(int bct2) {
		this.bct2 = bct2;
	}
}
