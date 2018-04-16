package com.mmmm.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamTest {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println("private String Ch"+i+"_1;");
		}
		
		Date aDate = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(df.format(aDate));
	}
}
