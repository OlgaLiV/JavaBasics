package com.syntax.class30;

public abstract class Card {
/*
 * Create a Card class that will have implemented
 *   and unimplemented methods and a constructor 
 *   that will initializes credit card type.  
 *   Create 3 subclasses of a Card card.
 *    Create 3 objects of different card and 
 *    store them into LinkedList.
 *     Using for loop/advanced for loop/ iterator 
 *     access all methods of the class.
 */
	public String cardType;
	public Card(String cardType) {
		this.cardType = cardType;
	}
	
	public abstract void getCreditCard();
	public abstract void getDebetCard();
	public void getBalance() {
		System.out.println("You can get your balance by phone or app");
	}	
}

class BankInUkraine extends Card{
	public BankInUkraine(String cardType){
		super(cardType);
	}
	
	public void getCreditCard() {
		System.out.println("To get credit card" + cardType + " in Ukranian bank you must have good score");
	}
	
	public void getDebetCard() {
		System.out.println("To get debet card " + cardType + " in Ukrainian bank you must have minimum balance = UAH1000");
	}
}

class BankInGermany extends Card{
	public BankInGermany(String cardType){
		super(cardType);
	}
	
	public void getCreditCard() {
		System.out.println("To get credit card" + cardType + " in Germany bank you must have good score");
	}
	
	public void getDebetCard() {
		System.out.println("To get debet card " + cardType + " in Germany bank you must have minimum balance = Є1000");
	}
}

class BankInUSA extends Card{
	public BankInUSA(String cardType){
		super(cardType);
	}
	
	public void getCreditCard() {
		System.out.println("To get credit card" + cardType + " in USA bank you must have good score");
	}
	
	public void getDebetCard() {
		System.out.println("To get debet card " + cardType + " in USA bank you must have minimum balance = $1000");
	}
}

