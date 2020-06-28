package com.syntax.class07;

import java.util.Scanner;

public class LotteryTask {
	public static void main(String[] args) {
		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20;
		// until he guesses the lucky number -->
		// In that case we print "Congrats, you won!"

		Scanner scan = new Scanner(System.in);
		int luckyNumber = 17;
		int num;
		System.out.println("Please enter any number from 1 -20: ");
		num = scan.nextInt();
		
		while(num != luckyNumber) {
			System.out.println("Please enter any number from 1 -20: ");
			num = scan.nextInt();
		}
		
		
		
		
//		do {
//			System.out.println("Please enter any number from 1 -20: ");
//			num = scan.nextInt();
//		} while (num != luckyNumber);
//
//		
//			System.out.println("Congrats, you won!");
//		
		

//		for (num = 1; num <= 20; num++) {
//			if (num == 17) {
//				System.out.println("Congrats!");
//			} else if (num <= 0 && num > 20) {
//				System.out.println("Invalid number");
//			} else {
//				System.out.println("Try again");
//			}
//		}

//		while (true) {
//			if (num >= 1 && num <= 1) {
//				if (num == 1) {
//					System.out.println("Congrats< you won!");
//					break;
//				}
//			}else {
//				System.err.println("INVALID NUMBER");
//			}
//
//		}
	}
}
