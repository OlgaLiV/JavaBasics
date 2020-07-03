package com.syntax.class17;

public class Task {
	public static void main(String[] args) {
		Task obj = new Task();
		String email = obj.createEmail("olga", "Litvinenko", "@gmail");
		System.out.println(email);

		boolean prime = obj.isPrime(25);
		System.out.println(prime);

		char grade = obj.getGrade(101);
		System.out.println(grade);

	}

	String createEmail(String name, String lastName, String mail) {
		String email = name.concat(lastName).concat(mail).toLowerCase();

		return email;
	}

	boolean isPrime(int a) {
		int num = 0;
		boolean prime = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				prime = true;
				break;
			}
		}

		if (!prime) {
			return prime;

		} else {
			return !prime;
		}
	}

	char getGrade(int a) {
		char grade = 'a';

		if (a > 90) {
			grade = 'A';
		} else if (a >= 80 && a <= 90) {
			grade = 'B';
		} else if (a > 70 && a <= 80) {
			grade = 'C';
		} else if (a > 50 && a <= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;

	}
}
