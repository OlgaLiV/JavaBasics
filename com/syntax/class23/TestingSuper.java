package com.syntax.class23;

public class TestingSuper {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.displayName();
		obj.printHello();
		
		SuperClass obj1 = new SuperClass();
		obj1.printHello();
		System.out.println(obj1.name);
	}

}
