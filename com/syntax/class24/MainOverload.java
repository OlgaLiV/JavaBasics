package com.syntax.class24;

import com.syntax.class17.Main;

public class MainOverload {
	
	public static void main(String[] args) {
		System.out.println("Main method with String array");
		
	}
	
	public static void main(String str) {
		System.out.println("I am a main method with String");
	}
	
	public static void main(String str, int num) {
		System.out.println("I am a main method with two parameters");
	}
}
