package com.syntax.class35;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		// create an object of Workbook
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sample");
		// Get number of rows and columns
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		List<Map<String, String>> xlList = new ArrayList<>();
		for (int r = 1; r < rows; r++) {
			Map<String, String> lmap = new LinkedHashMap<>();

			for (int c = 0; c < cols; c++) {
				lmap.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());

			}
			xlList.add(lmap);
		}

	}
}
