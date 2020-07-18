package com.syntax.class24;

public class Student {
public void study() {
	System.out.println("All students are study");
}

public void sleepy() {
	System.out.println("Students are always sleepy");
}
}

class SyntaxStudent extends Student{
	public void inLoveWithJava() {
		System.out.println("Syntax students love JAVA the most");
	}
	
	public void study() {
		System.out.println("Syntax students studying harder then anybody");
	}
	
	public void sleepy() {
		System.out.println("We are never sleep");
	}
}

class CollegeStudent extends Student{
	public void read() {
		System.out.println("College students read tonns of books");
	}
}

class SchoolStudent extends Student{
	public void study() {
		System.out.println("School time - best time ever");
	}
}