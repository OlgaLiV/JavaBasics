package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {

		boolean quiz = true;
		int score = 95;

		if (quiz) {
			if (score >= 90) {
				System.out.println("A, Great Job!");
			} else if (score >= 80) {
				System.out.println("B, Well Done!");
			} else if (score >= 70) {
				System.out.println("C, Just Passed!");
			} else {
				System.out.println("F, You Failed!");
			}
		} else {
			System.out.println("Please, Finish Your Quiz!");
		}

	}
}
