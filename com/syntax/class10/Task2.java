package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
		for (int row = 5; row >= 1; row--) {
			for (int j = row; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
