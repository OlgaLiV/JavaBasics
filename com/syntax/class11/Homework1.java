package com.syntax.class11;

public class Homework1 {
	public static void main(String[] args) {
		int[][] numbers = { { 3, 20, 55, 90 }, { 2, 7, 48, 21 }, { 79, 8, 22, 5 } };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if ((numbers[i][j] % 2) == 0) {
					System.out.print(numbers[i][j] + " ");
				}

			}

		}
	}
}