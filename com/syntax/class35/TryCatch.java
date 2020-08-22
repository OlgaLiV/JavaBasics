package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		try {// code that might throw an exception
			FileInputStream fis = new FileInputStream(filePath);

		} catch (FileNotFoundException fne) {// catching right exception

			System.out.println("I caught the exception");

		}

		System.out.println("End of the code");

		System.out.println("   -------------------------   ");

		int[] array = { 10, 20 };
		try {
			System.out.println(array[2]);
		} catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("I caught the ArrayIndexOutOfBoundsException");
		}

		System.out.println("End of the code");

	}

}
