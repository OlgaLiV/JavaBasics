package com.syntax.class26;

public class FileTest {
	public static void main(String[] args) {
//		File java = new JavaFile();
//		java.edit();
//		java.close();
//		java.open();
//		
//		System.out.println("***********");
//
//		File word = new WordFile();
//		word.edit();
//		word.close();
//		word.open();
//		
//		System.out.println("***********");
//
//		File pdf = new PdfFile();
//		pdf.edit();
//		pdf.close();
//		pdf.open();

		File[] files = { new JavaFile(), new WordFile(), new PdfFile() };
		for(File file:files) {
			file.open();
			file.close();
			file.edit();
			System.out.println("***********");
			
		}
	}
}
