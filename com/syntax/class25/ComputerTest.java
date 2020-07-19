package com.syntax.class25;

public class ComputerTest {
	public static void main(String[] args) {
		Computer[] comp = {new Apple("Apple", "PRO", 17), new Lenovo("Lenovo","DH3421", 11), new HP("HP","asdf", 16), new Dell("Dell", "dello", 1)};
		int size = comp.length;
		
		for(int i = 0; i<size; i++) {
			comp[i].haveBigScreen();
			comp[i].haveOS();
			System.out.println("=====");
		}
	
	}
}
