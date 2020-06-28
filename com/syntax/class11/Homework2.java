package com.syntax.class11;

public class Homework2 {
	public static void main(String[] args) {
		int[][] num = { { 4, 5, 6 }, { 7, 8, 9 }, { 1, 2, 3 } };
		int sum = 0;
		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				
				sum += num[r][c];
				
			}
			
		}
		System.out.println(sum);
	}
}
