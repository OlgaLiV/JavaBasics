package com.syntax.class23_1;

public class Programming {
	String language;

	public void displayProgramming() {
		System.out.println("I love programming languages");
	}

	public void displayProgramming(String language) {
		this.language = language;
		System.out.println("I love " + language);
	}

	public static void main(String[] args) {
		Programming obj = new Programming();
		obj.displayProgramming();
		obj.displayProgramming("Java");
	}
}
