package com.syntax.class20;

public class USA {
	//define 2 variables for state and capital and have a constructor to initialize it
	static String country;
	String state;
	String capital;
	
	USA(String state,String capital ){
		this.state = state;
		this.capital = capital;
	}
	
	public void display() {
		System.out.println("State is " + state + " and it's capital is " + capital);
	}
}
