package com.syntax.class24;

public class CreditCard {
	double balance, interest;
	
	public CreditCard (double balance){
		this.balance = balance;
	}

	double calculateInterest() {
		interest = (0.04 * balance) * 30;
		return interest;
	}
}

class Visa extends CreditCard{
	public Visa(double balance){
		super(balance);
	}
}

class AX extends CreditCard{
	public AX(double balance){
		super(balance);
	}
	double calculateInterest() {
		interest = (0.055 * balance) * 30;
		return interest;
	}
}
