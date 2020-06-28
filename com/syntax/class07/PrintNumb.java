package com.syntax.class07;

public class PrintNumb {
	public static void main(String[] args) {
		// how to print numbers from 1 to 50
		int num = 1;
		while (num <= 50) {
			System.out.println(num);
			num++;
		}

		System.out.println("---------");
		// how to print numbers from 20 to 30
		int y = 20;
		while (y <= 30) {
			System.out.println(y);
			y++;
		}

		int z = 5;
		while (z <= 15) {
			System.out.print(z + " ");
			z++;
		}
		System.out.println();
		System.out.println("-----------------------------");
		int r = 10;
		while (r > 0) {
			System.out.print(r + " ");
			r--;
		}
		System.out.println();
		System.out.println("-----------------------------");

	}
}
