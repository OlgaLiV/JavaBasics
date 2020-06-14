package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		// widening, implicit casting, automatically
		double d = 7.0;
		System.out.println(d);
		
		// narrowing, explicit, manually
		//int i = 7.58; //compile time error: --> Type mismatch: cannot convert from double to int		
		int i = (int) 7.58;
		System.out.println(i);
		
		//narrowing a large number into a byte explicity doing it, manually
		byte b = (byte) 123865;
		System.out.println(b);
		
		//narrowing, explicity/manually. You are trying to fit something from
		//a big box into a small
		
		long l1 = 45;
		int number1 = (int)l1;
		System.out.println("Number1 = " + number1);
		
		long l2 = 2334567898754l;
		int number2 = (int) l2;
		System.out.println("Number2 = " + number2);
		
		
		
		
		
		
		
		
		
	}

}
