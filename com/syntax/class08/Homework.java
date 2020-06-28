package com.syntax.class08;

public class Homework {
	public static void main(String[] args) {
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("---------1st way----------");
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}

		System.out.println("---------1st way----------");

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);

		}
	}
}
