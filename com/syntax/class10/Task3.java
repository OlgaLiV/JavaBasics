package com.syntax.class10;

public class Task3 {
	public static void main(String[] args) {
		// 1st way
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		// 2nd way
		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';

		System.out.println(grades1[1]);

	}
}
