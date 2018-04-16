package com.mmmm.entity;

import java.io.Serializable;

/**
 * 题目的实体类
 * 
 * @author Noor
 *
 */
public class Questions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String quesId;

    private String quesLevel;

    private String quesContent;

	private String chOptiona;

    private String chOptionb;

    private String chOptionc;

    private String chOptiond;

    private String juAnswer;

    private String chAnswer;

    private String state;

    public String getQuesId() {
        return quesId;
    }

    public void setQuesId(String quesId) {
        this.quesId = quesId == null ? null : quesId.trim();
    }

    public String getQuesLevel() {
        return quesLevel;
    }

    public void setQuesLevel(String quesLevel) {
        this.quesLevel = quesLevel == null ? null : quesLevel.trim();
    }

    public String getQuesContent() {
        return quesContent;
    }

    public void setQuesContent(String quesContent) {
        this.quesContent = quesContent == null ? null : quesContent.trim();
    }

    public String getChOptiona() {
        return chOptiona;
    }

    public void setChOptiona(String chOptiona) {
        this.chOptiona = chOptiona == null ? null : chOptiona.trim();
    }

    public String getChOptionb() {
        return chOptionb;
    }

    public void setChOptionb(String chOptionb) {
        this.chOptionb = chOptionb == null ? null : chOptionb.trim();
    }

    public String getChOptionc() {
        return chOptionc;
    }

    public void setChOptionc(String chOptionc) {
        this.chOptionc = chOptionc == null ? null : chOptionc.trim();
    }

    public String getChOptiond() {
        return chOptiond;
    }

    public void setChOptiond(String chOptiond) {
        this.chOptiond = chOptiond == null ? null : chOptiond.trim();
    }

    public String getJuAnswer() {
        return juAnswer;
    }

    public void setJuAnswer(String juAnswer) {
        this.juAnswer = juAnswer == null ? null : juAnswer.trim();
    }

    public String getChAnswer() {
        return chAnswer;
    }

    public void setChAnswer(String chAnswer) {
        this.chAnswer = chAnswer == null ? null : chAnswer.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
	public String toString() {
		return "Quertions [quesId=" + quesId + ", quesLevel=" + quesLevel + ", quesContent=" + quesContent
				+ ", chOptiona=" + chOptiona + ", chOptionb=" + chOptionb + ", chOptionc=" + chOptionc + ", chOptiond="
				+ chOptiond + ", juAnswer=" + juAnswer + ", chAnswer=" + chAnswer + ", state=" + state + "]";
	}
}
