package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class FacebookProp {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/FacebookCredentials";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		
	}

}
