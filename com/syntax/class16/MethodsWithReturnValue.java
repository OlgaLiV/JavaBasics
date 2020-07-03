package com.syntax.class16;

public class MethodsWithReturnValue {
// create a String and based on the length
//of the string define whether string 
//long or short (long > 10, short < 10)
	public static void main(String[] args) {

		String str = "I love Java";
		int length = str.length();
		if (length >= 10) {
			System.out.println("Your created string is long");
		} else {
			System.out.println("Your created string is short");
		}

		// define which number is larger and then
		// define whether this number is even or odd
		TaskMethod obj = new TaskMethod();
		obj.num(10, 20);

	}

	int largest(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

}