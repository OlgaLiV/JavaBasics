package com.syntax.class12;

public class Recap2DArrays {
	public static void main(String[] args) {
		String[][] animal = { { "cat", "dog", "bird", "hamster" }, // 1st array or 1st row
				{ "tiger", "children", "bear" }, // 2nd array or 2nd row
				{"salmon", "shrimp", "sea bass"}
		};
		int howManyArrays = animal.length; // how many rows
		System.out.println(howManyArrays);
		int elementsFrom1Array = animal[1].length; // how many columns in row 2
		System.out.println(elementsFrom1Array);

		String element = animal[1][1];
		System.out.println(element);
		
		System.out.println("-----Using For Loop------");

		for (int r = 0; r < animal.length; r++) {
			for (int c = 0; c < animal[r].length; c++) {
				String animals = animal[r][c];
				System.out.print(animals + " ");
			}
			System.out.println();
		}
		System.out.println("-----Using Enhanced For Loop------");
		for(String []array:animal) {
           for(String an:array) {
        	   System.out.print(an + " ");
        	   }
           System.out.println();
           }
        	   

	}
}
