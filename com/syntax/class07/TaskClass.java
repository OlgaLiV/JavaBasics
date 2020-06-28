package com.syntax.class07;

public class TaskClass {
	public static void main(String[] args) {
		int x = 50;
		while (x > 0) {
			System.out.print(x + " ");
			x--;
		}
		System.out.println();
		System.out.println("----------------");
		// 1st way, using mod (%)
		int y = 1;
		while (y <= 20) {
			if (y % 2 == 1) {
				System.out.println(y);
			}
			y++;
		}

		// 2nd way, increasing by 2
		System.out.println("----------------");
		int z = 1;
		while (z <= 20) {
			System.out.println(z);
			z += 2;
		}

		System.out.println("----------------");

		// 3rd way,
		int k = 0;
		while(k <20) {
			k++;
			System.out.println(k);
			k++;
		}

	}
}
