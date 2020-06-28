package com.syntax.class14;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Create a username");
		String name = scan.nextLine();

		System.out.println("Create a password");
		String password = scan.nextLine();

		//System.out.println("Comfirm your password");
		//String password1 = scan.nextLine();

		if (name.isEmpty() || password.isEmpty()) {
			System.err.println("Username or password cannot be empty");
		} else {			
			if (password.length() < 8) {
				
				System.err.println("Password is too short");
			} else {
				
				if (password.contains(name)) {
					System.err.println("Password cannot contain username");
					
				} else {
					System.out.println("Comfirm your password");
					String password1 = scan.nextLine();

					if (password.contentEquals(password1)) {
						System.out.println("Your username and password has been created");
					} else {
						System.err.println("Passwords do not match");
					}
				}
			}
		}

	}
}
