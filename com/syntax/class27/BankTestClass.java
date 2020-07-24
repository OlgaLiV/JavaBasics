package com.syntax.class27;

public class BankTestClass {
	public static void main(String[] args) {
		
	System.out.println("======PNC objects======");
	Trustable trust = new PNC();
	trust.trust();
	
	Bank bank = new PNC();
	bank.deposit();
	bank.withdraw();
	bank.trust();
	
	PNC pnc = new PNC();
	pnc.deposit();
	pnc.withdraw();
	pnc.trust();
	pnc.giveMortgage();
	pnc.doInvestments();
	
	Bank[] trustable = {new PNC(), new BOA()};
	for(Bank t:trustable) {
		t.deposit();
		t.withdraw();
		t.trust();
		System.out.println("------");
	}
	
	System.out.println("=====Object of BOA=====");
	BOA boa = new BOA();
	boa.deposit();
	boa.withdraw();
	boa.trust();
	boa.doInvestments();
	boa.givesLoan();

}
}
