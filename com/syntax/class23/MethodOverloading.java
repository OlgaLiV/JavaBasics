package com.syntax.class23;

public class MethodOverloading {

	// let's create a method add

	public int sum(int num1, int num2) {
		return num1 + num2;
	}
// NOT gonna work if change return type 
// but live signature the same
//	public void sum(int num1, int num2) {
//		return num1 + num2;
//	}
	// 1. by changing number of parameters

	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;

	}
	// 2. by changing type of parameters

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

}
