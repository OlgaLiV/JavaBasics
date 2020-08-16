package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsernameAndPasswordExcel {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/testdata/UsernameAndPass.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		sheet.createRow(1).createCell(0).setCellValue("Olga");
		sheet.getRow(1).createCell(1).setCellValue("Olga12345");
		sheet.createRow(2).createCell(0).setCellValue("Michael");
		sheet.getRow(2).createCell(1).setCellValue("Michael123");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
		
		
		
		
		
	}
}
