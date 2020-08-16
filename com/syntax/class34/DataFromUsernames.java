package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromUsernames {
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/testdata/UsernameAndPass.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> list = new ArrayList<>();
		
		for(int r = 1; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int c = 0; c < cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
				
			}
			list.add(map);
		}
		for(Map<String, String> mappy:list) {
			System.out.println(mappy);
		}
		

	}

}
