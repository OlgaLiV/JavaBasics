package com.syntax.class25;

public class SuperClass {
	protected static void enjoy() {
		System.out.println("I enjoy Sundays");
	}
}

class SubClass extends SuperClass {
	// this process named method hidFing
	public static void enjoy() {
		System.out.println("I enjoy everyday");
	}
}
