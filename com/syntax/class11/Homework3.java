package com.syntax.class11;

public class Homework3 {
public static void main(String[] args) {
	int [][]num = {{3,6,7,9},{32,64,89,12},{22,57,99,1}};
	for(int i = 0; i<num.length;i++) {
		for(int j = 0; j<num[i].length; j++) {
			System.out.print(num[i][j] + " ");
		}
		System.out.println();
	}
}
}
