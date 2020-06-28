package com.syntax.class15;

public class TaskClass3 {
	public static void main(String[] args) {
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = str.split("[?]");
		int sentences = array.length;
		System.out.println(sentences);

	}
}
