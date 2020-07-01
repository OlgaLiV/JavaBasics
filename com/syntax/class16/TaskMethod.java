package com.syntax.class16;

public class TaskMethod {

	void num(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	void evenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("The number " + n + " is even");
		} else {
			System.out.println("The number " + n + " is odd");
		}
	}

	void isPal(String str) {
		String pal = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pal += str.charAt(i);
		}
		if (pal.equalsIgnoreCase(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is NOT a palindrome");
		}
	}

	void lang(String c) {
		c = c.toLowerCase();
		if (c.equals("ukraine")) {
			System.out.println("Доброго дня");
		}
		if (c.equals("usa")) {
			System.out.println("Hello");
		}
		if (c.equals("spain")) {
			System.out.println("Hola");
		}
	}
}
