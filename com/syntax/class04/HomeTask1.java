package com.syntax.class04;

import java.util.Scanner;

public class HomeTask1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please type what amount do you need to loan? It should be a number.");
		int amount = scan.nextInt();

		if (amount <= 200000) {
			System.out.println("Ok I will help you and lend you money!");
		} else {
			System.out.println("Sorry but you need work harder!");
		}

	}

}
