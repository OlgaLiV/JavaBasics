package com.syntax.class14;

import java.util.Scanner;

public class TaskUsingWhileLoop {
	public static void main(String[] args) {

		// Accept username, password and confirm password from a user and check
		// following requirements:
//1.Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//2.Password should be minimum 8 characters, if less → message=“Password is too short”.
//3.Password cannot contain username if so, → message=“Password cannot contain username”.
//4.Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met → message “Your username and password has been created”

		Scanner scan = new Scanner(System.in);
		int count = 0;
		boolean create = true;
//		System.out.println("Please create a username:");
//		String name = scan.nextLine();
//		System.out.println("Please enter your password:");
//		String pass = scan.nextLine();
		do {

			System.out.println("Please create a username:");
			String name = scan.nextLine();
			System.out.println("Please enter your password:");
			String pass = scan.nextLine();
			count++;

			if (!name.isEmpty() && !pass.isEmpty()) {
				if (pass.length() >= 8) {
					if (!pass.contains(name)) {
						System.out.println("Please confirm your password");
						String pass1 = scan.nextLine();
						if (pass1.equals(pass)) {
							System.out.println("Your username and password has been created");
							break;
						} else {
							System.err.println("Passwords do not match");
							System.out.println();

						}
					} else {
						System.err.println("Password cannot contain username");
						System.out.println();
					}

				} else {
					System.err.println("Password is too short");
					System.out.println();
				}

			} else {
				System.err.println("Username and Password cannot be empty");
				System.out.println();
			}

		} while (create);
	}

}
