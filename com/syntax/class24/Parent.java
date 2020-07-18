package com.syntax.class24;

public class Parent {
	private void hello() {
		System.out.println("Hello from parent class");
	}
	
	protected static void hi() {
		System.out.println("Hi from parent class");
	}
}

class Child extends Parent {
	// Cannot override because of private access modifier
	//creating own private method inside child class
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//@Override --> CE:
	// Cannot override static methods
	public static void hi() {
		System.out.println("Hi from child class");
	}
}
