package com.syntax.class06;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number");
		int num1 = scan.nextInt();

		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		int result = 0;

		System.out.println("Please enter an operator. This should be +, -, * or /");
		char sign = scan.next().charAt(0);

		switch (sign) {
		case '+':
			System.out.println(result = num1 + num2);
			break;
		case '-':
			System.out.println(result = num1 - num2);
			break;
		case '*':
			System.out.println(result = num1 * num2);
			break;
		case '/':
			System.out.println(result = num1 / num2);
			break;
		}
		System.out.println("The result will be " + result);
	}
}
