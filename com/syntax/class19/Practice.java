package com.syntax.class19;

public class Practice {
	static String str = "I love my family";

	protected int displaySum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;

		}
		return sum;
	}

	public static String reverse(String value) {
		String rev = "";
		for (int i = value.length() - 1; i >= 0; i--) {

			rev += value.charAt(i);
		}

		return rev;
	}

	private static String displayVowels(String value) {

		str = str.replaceAll("[^aeiouAEIOU]", "");
		return str;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 1, 6 };
		Practice task = new Practice();
		System.out.println(task.displaySum(arr));

		String s = "Java";
		System.out.println(reverse(s));

		System.out.println(displayVowels(str));
	}
}
