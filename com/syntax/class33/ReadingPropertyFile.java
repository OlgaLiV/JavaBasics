package com.syntax.class33;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	public static void main(String[] args) throws IOException {
		// 1.Identify path to the file you would like to read
		String filePath = "configs/Example.properties";
		
		// 2.Create an object of FileInputStream class
		FileInputStream fis = new FileInputStream(filePath);
		
		// 3.To work with property file we use Property class in Java
		Properties prop = new Properties();
		prop.load(fis);
		String value1 = prop.getProperty("username");
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);
		
		String value3 = prop.getProperty("password");
		System.out.println(value3);
		
		String value4 = prop.getProperty("adress");
		System.out.println(value4);
		
		
		
		
		

	}
}
