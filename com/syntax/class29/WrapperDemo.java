package com.syntax.class29;

public class WrapperDemo {
	public static void main(String[] args) {

		int num = 10;

		Integer num1 = 100; // Autoboxing
		String str = num1.toString().concat("Hello");
		System.out.println(str);

		Byte b = 10;
		System.out.println(b.MAX_VALUE);

		Boolean bool = true;

		Character ch = 'a';

		Double d = 10.99;

	}
}
