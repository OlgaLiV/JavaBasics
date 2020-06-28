package com.syntax.class10;

public class ArrayIntro {
	public static void main(String[] args) {
       // Array is a tray of tea cups
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		int[] numbers = new int[4];// index from 0 to 3
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		System.out.println(numbers[3]);
		
		String[] carArray; // Preffered way
		String carArray1[]; //works but not preferred
		
		carArray = new String[3];
		carArray[0] = "BMW";
		carArray[1]= "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla"; // will print a runtime-error
		
		String car = carArray[2];
		System.out.println(car);
		System.out.println("----------------");
		
		char[] letters = new char[4];
		
		
	}

}
