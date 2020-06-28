package com.syntax.class15;

public class HomeWork4 {
	public static void main(String[] args) {
		String str1 = "Olga";
		String str2 = "LiV";
		System.out.println("Strings before swap: " + str1 + " " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Strings after swap: " + str1 + " " + str2);

	}
}
