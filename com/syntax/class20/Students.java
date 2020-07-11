package com.syntax.class20;

public class Students {
	
	String name;
	int grade1, grade2, grade3;

	public int printAverage() {
		int average = (grade1 + grade2 + grade3) / 3;
		return average;
	}

	Students(String firstName, int a, int b, int c) {
		name = firstName;
		
		grade1 = a;
		grade2 = b;
		grade3 = c;

	}

}
