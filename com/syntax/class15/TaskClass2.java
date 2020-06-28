package com.syntax.class15;

public class TaskClass2 {
	public static void main(String[] args) {
		String str = "My Phone No is #345676909009874";
		int str1 = str.replaceAll("[^A-Za-z]", "").length();
		System.out.println(str1);
	}
}
