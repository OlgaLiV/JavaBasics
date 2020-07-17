package com.syntax.class23_1;

public class StaticMethod {
	static void displayInfo() {
		System.out.println("This is empty method");
	}

	static void displayInfo(String str) {
		System.out.println("This is method with 1 parameter - " + str);
	}

	static void displayInfo(String str, String str1) {
		System.out.println("This is method with 2 parameters - " + str + " and " + str1);
	}

	public static void main(String[] args) {
		displayInfo();
		displayInfo("Homework");
		displayInfo("Weekend", "Summer");
	}
}
