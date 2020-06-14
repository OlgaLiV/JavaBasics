package com.syntax.class04;

public class MoreNested {

	public static void main(String[] args) {
		boolean isFriday = true;
		int date = 11;

		if (isFriday) {
			System.out.println("Yay! It's friday!");
			if (date == 13) {
				System.out.println("Let's watch a scary movie!");
			} else {
				System.out.println("Let's watch a comedy!");
			}

		} else {
			System.out.println("We are going to study JAVA!");
		}

	}

}
