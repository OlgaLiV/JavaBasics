package com.syntax.class03;

public class CompoundOperator {
	
	public static void main(String[] args) {
		
		int num = 100;
		num = num + 100; //200
		System.out.println(num);
		
		num = num + 100; //300
		System.out.println(num);
		
		//We can use compound operators which are shorter
		num += 100;		
		System.out.println(num);//400
		
		//num = num - 50;
		num -= 50;
		System.out.println(num);//350
		
		num /= 7;
		System.out.println(num);//50
		
		num *= 2;
		System.out.println(num);//100
		
		num %= 9;
		System.out.println(num);//1
		
		
	}

}
