package com.syntax.class18;

public class LocalVariables {
	public static void main(String[] args) {

		String name = "Mohammed"; // local to main method and it's scope only within main method

		for (int i = 1; i <= 5; i++) {
			System.out.println("Today is a Java Class");
			System.out.println(i);
		}
		// System.out.println(i); --> CE: i cannot be resolved to a variable
		
		int a;// declare a variable 
		for ( a = 0; a<=3;a++) {
			System.out.println(a);
		}
		System.out.println(a);


	}

	void displsyName() {
		// System.out.println(name);--> CE: i cannot be resolved to a variable
        // name is not visible to the displayNane methods because it's local to main
	}
	// create a method that return sum of 2 numbers
	
	int sum (int num1, int num2) {// num1 and num2 - local variables to method sum
		return num1 + num2;
	}
	
	double div (double num1, double num2) {//// num1 and num2 - local variables to method div
		return num1/num2;
	} 
	
}
