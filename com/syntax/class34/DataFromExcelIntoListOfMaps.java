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

public class DataFromExcelIntoListOfMaps {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		// create an object of Workbook
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sample");
		// Get number of rows and columns
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		// create an empty List
		List<Map<String, String>> xlList = new ArrayList<>();
		
		// loop over rows
		for (int r = 1; r < rows; r++) {
			// foe every column create a new Map
			Map<String, String> map = new LinkedHashMap<>();
			// loop over every column
			for (int c = 0; c < cols; c++) {
				// get keys from 1 rows (header)
				String key = sheet.getRow(0).getCell(c).toString();
				// get values from other rows
				String value = sheet.getRow(r).getCell(c).toString();
				// store values from each cell of the row into map
				map.put(key, value);
			}
			//add created map with values into list
			xlList.add(map);
		}
		
		System.out.println(xlList);
		
		System.out.println("----- Printing maps 1 by 1");
		for(Map<String, String> littleMap:xlList) {
			System.out.println(littleMap);
		}

	}

}
