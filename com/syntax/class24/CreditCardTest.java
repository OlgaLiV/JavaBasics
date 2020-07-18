package com.syntax.class24;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard credit = new CreditCard(30000);
		double d1 = credit.calculateInterest();
		System.out.println(d1);

		Visa visa = new Visa(500000);
		double d2 = visa.calculateInterest();
		System.out.println(d2);

		AX ax = new AX(132866);
		double d3 = ax.calculateInterest();
		System.out.println(d3);
	}
}
