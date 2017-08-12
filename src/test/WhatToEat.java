package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WhatToEat {

	public static void main(String[] args) {
		// Ã¿Ìì³ÔÊ²Ã´
List<String> list =new ArrayList<String>();
list.add("»ÆìË¼¦Ã×·¹");
list.add("ºĞ·¹");
list.add("ÅúÈø");
list.add("ÂéÀ±Ïã¹ø/ÂéÀ±ÌÌ");
list.add("½È×Ó");
list.add("³´²Ë");
list.add("¿¾ÈâÍ°·¹/´àÆ¤¼¦·¹");
list.add("ºº±¤/Õ¨¼¦");
list.add("Ãæ");
int n=10;
while(n-->0){
System.out.println(list.get((new Random()).nextInt(9)));}
	}

}
