package com.syntax.class11;

public class RetrievingValuesFromTwoArrays {
	public static void main(String[] args) {

		String[][] month = { { "December", "January", "February" },
				             { "March", "April", "May", },
				             { "June", "July", "August" }, 
				             { "September", "October", "November" } 
				             };
		int rows = month.length; // how many arrays are inside, how many rows?
		System.out.println(rows + " seasons");
		
		int winterLength = month[0].length; // how many elements/columns are in row with index 0
		System.out.println(winterLength + " month in winter");
		
		int lastRowSize = month[rows -1].length;
		
		//Nes<<ted loops are married (joke) to 2D Arrays
		for (int row = 0; row < month.length; row++) {// iterating over rows
			for(int colum = 0; colum < month[row].length; colum++) {// iterating over coloums
				System.out.print(month[row][colum] + " ");
			}
			System.out.println();
		}
		
	}
}