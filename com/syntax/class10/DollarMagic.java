package com.syntax.class10;



public class DollarMagic {
	public static void main(String[] args) {
		/*
		 * let's print The Dollar $$$$ $ $ $ $ $ $ $$$$
		 */
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 4; c++) {
				if (r == 1 || r == 5) {
					System.out.print("$");
				}else {
					if (c==1 || c==4) {
						System.out.print("$");
					}else {
						System.out.print(" ");
						}
					
				}
			}
			System.out.println();
		}
	}
}
