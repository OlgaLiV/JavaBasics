package com.syntax.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("Hello");// it is a mutable/changeable object
		strBuffer.append(" friends");
		System.out.println(strBuffer);

		String str2 = "Hello";
		str2.concat(" friends");
		System.out.println(str2);

	}
}
