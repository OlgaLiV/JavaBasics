package com.syntax.class35;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class StaticMethodListOfExceptions {
	public static void main(String[] args) {
		
		List<String> list = lOE();
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public static List<String> lOE(){
		List<String> list = new ArrayList<>();
		
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(Exception ae) {
			list.add("First Exception: " + ae.getMessage());
		}
	
	
	int[] array = {1,2,3};
	try {
		System.out.println(array[3]);
	}catch(Exception obe) {
		list.add("Second Exception: " + obe.getMessage());
	}
	
	String str = null;
	try {
		System.out.println(str.length());
	}catch(Exception third) {
		list.add("Third Exception: " + third.getMessage());
	}
	
	String filePath = "/testdata/SampleTestData";
	try {
		FileInputStream fis = new FileInputStream(filePath);
	}catch(Exception four) {
		System.out.println("Fourth Exception: " + four.getMessage());
	}
	
	return list ;
	}
}
