package com.syntax.class04;

public class NestedIfTaskMore {
	public static void main(String[] args) {

		double rate = 3.1;
		double price = 500000;

		if (rate > 4.5) {
			System.out.println("Collect more money!");
		} else {
			System.out.println("You can do it!");
			if (price > 200000) {
				System.out.println("Take a loan!");
			} else {
				System.out.println("Pay cash!");
			}
		}

	}

}
