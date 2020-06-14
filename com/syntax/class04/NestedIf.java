package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {
		boolean allergy = true;
		boolean peanut = false;
		boolean lactose = true;
		boolean bee = true;
		boolean seafood = false;

		if (allergy) {
			if (peanut) {
				System.out.println("Don't eat peanut!");
			}
			if (lactose) {
				System.out.println("Don't drink milk!");
			}
			if (bee) {
				System.out.println("Don't mess with bees!");
			}
			if (seafood) {
				System.out.println("Don't eat fish!");
			}

		} else {
			System.out.println("You are healthy person!");
		}

	}

}
