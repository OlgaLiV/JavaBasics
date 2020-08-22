package com.syntax.class35;

import java.io.FileInputStream;

import javax.imageio.stream.FileImageInputStream;

public class ExceptionIntro {
	public static void main(String[] args) {
		String xlFilePath = System.getProperty("user.dir") + "/SampleTestData.xlsx";
		//FileInputStream fis = new FileInputStream(xlFilePath);
		
		
		int a =10;
		int b =0;
		//System.out.println(a/b); // Arithmetical exception
		
		int[] arr = {100,200};
		System.out.println(arr[2]);//ArrayIndexOutOfBoundsException
		
		System.out.println("End of the code");
		
		
	}

}
