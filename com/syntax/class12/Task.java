package com.syntax.class12;

public class Task {
	public static void main(String[] args) {
		String[][] food = { { "Borsh", "Salo", "Vareniki", "Chiken Kiev" },
				{ "Pizza", "Pasta", "Lasagna", "Ravioli" },
				{ "Macaroni", "Croissant", "Souffle" } };
		for (int r = 0; r < food.length; r++) {
			for (int c = 0; c < food[r].length; c++) {
               System.out.print(food[r][c] + " ");
			}
System.out.println();
		}
		
		System.out.println("=============");
		
		for(String[] a:food) {
			for (String b:a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}
