package com.syntax.class24;

public class StudentTest {
	public static void main(String[] args) {
		Student std = new SyntaxStudent();
		std.study();
		std.sleepy();
		
		SyntaxStudent syntax = new SyntaxStudent();
		syntax.inLoveWithJava();
		
		Student col = new CollegeStudent();
		col.sleepy();
		col.study();
		
		CollegeStudent col1 = new CollegeStudent();
		col1.read();
		
		Student sc = new SchoolStudent();
		sc.study();
		sc.sleepy();
		
		
		
		
		
	}
}
