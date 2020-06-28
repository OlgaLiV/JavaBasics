package com.syntax.class15;

public class SplitFunction {
	public static void main(String[] args) {
		String str = "Today is sunny day and we have Java class";
		String[] array = str.toLowerCase().split(" ");
		int howManyElements = array.length;
		System.out.println(howManyElements);

		for (String s : array) {
			System.out.print(s + "|");
			
			

		}

	}
}
