package com.syntax.class08;

public class SkippNumbers {
	public static void main(String[] args) {
        // I want to print from 1 to 10,
		// but i want to skip 5, 6, 7
		
		for(int i = 1; i < 11; i++) {
			if(i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		for (int i = 1; i <= 100; i++) {
			if (i >= 35 && i <= 55) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
