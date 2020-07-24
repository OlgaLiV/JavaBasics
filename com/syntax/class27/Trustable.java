package com.syntax.class27;

public interface Trustable {
	void trust();
}

interface Bank extends Trustable {

	void deposit();

	void withdraw();
}

class PNC extends Mortgage implements Bank, Investments {
	public void deposit() {
		System.out.println("PNC Bank takes deposit");
	}

	public void withdraw() {
		System.out.println("PNC gives you your money");
	}

	public void trust() {
		System.out.println("You can trust PNC Bank your money");
	}

	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}

	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}

abstract class Mortgage {
	public abstract void giveMortgage();
}

class BOA implements Bank, Investments {
	public void deposit() {
		System.out.println("BOA takes deposit");
	}

	public void withdraw() {
		System.out.println("BOA gives you your money");
	}

	public void trust() {
		System.out.println("You can trust BOA your money");
	}
	
	public void givesLoan() {
		System.out.println("You can take a loan in BOA");
	}
	
	public void doInvestments() {
		System.out.println("You can invest your money with BOA");
	}

}
