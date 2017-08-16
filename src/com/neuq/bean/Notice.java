package com.neuq.bean;

import java.io.Serializable;

public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;
	private String information;

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Notice [information=" + information + "]";
	}

     public Notice(String information) {
        this.information=information;
     }
}
