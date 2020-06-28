package com.syntax.class12;

public class Fibonacci {
public static void main(String[] args) {
	//Write a Java Program to print the first
	//10 numbers of Fibonacci series.
	
	int num = 10;
	int h = 0;
	int g = 1;
	
	for (int i = 0; i < num; i++) {
		int s = g;
		g = h + g;
		h = s;
		System.out.println(h + " ");
		
	}
	
}
}
