package com.syntax.class23_1;

public class PrivateMethod {
	private void Display() {
		System.out.println("There's nothing to print");
	}

	private void Display(int num1) {
		System.out.println(num1);
	}

	private void Display(int num1, int num2) {
		System.out.println(num1 + " and " + num2);
	}

	public static void main(String[] args) {
		PrivateMethod obj = new PrivateMethod();
		obj.Display();
		obj.Display(2);
		obj.Display(5, 10);
	}

}
