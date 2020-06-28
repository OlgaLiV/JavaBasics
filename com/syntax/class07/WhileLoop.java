package com.syntax.class07;

public class WhileLoop {
public static void main(String[] args) {
	int time = 10;
	
	if (time > 12) {
		System.out.println("Good morning");
	}
	System.out.println("---------------");
	
	// This code will execute infinitely
	while (time < 12) {
		System.out.println("Good morning");
		time++;
	}
	
	
	
	
	while (time> 12) {
	//// This code will not execute never
		System.out.println("Good morning");
	}
}
}
