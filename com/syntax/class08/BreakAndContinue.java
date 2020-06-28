package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {
		// We are counting from 1 to 10 and we want to
		// stop the loop when reach 4
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("We are outside the loop");
	}
}
