package com.syntax.class16;

public class DifferentMethods {
// let's create a method that says hello 10 times

	void sayHello(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}

	void printAnyWord(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
	// create a method isHungry that will accept
	// boolean value and print if passed value is true --> goo cook
	// othervise --> go study

	void isHungry(boolean areYouHungry) {
		if (areYouHungry) {
			System.out.println("Please cook for yourself");

		} else {
			System.out.println("Go study hard");
		}
	}

}
