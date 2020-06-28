package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {
		// print Hello 3 times
        // While checks before going to the loop (checks is soup hot before eating)
		int x = 11;
		while (x <= 3) {
			System.out.println("Hello!");
			x++;
		}

		System.out.println("*******Using a Do While********");
		// do while checks after going to the loop (checking the soup after eating)
		int y = 11;
		do {
			System.out.println("Hello!");
			y++;

		} while (y <= 3);
	}
}