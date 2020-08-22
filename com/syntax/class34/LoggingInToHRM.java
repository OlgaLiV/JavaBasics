package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingInToHRM {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String filePath = System.getProperty("user.dir") + "/testdata/UsernameAndPasswordForHrm.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> excelList = new ArrayList<>();
		for(int r = 1; r < rows; r++) {
			Map <String, String> map = new LinkedHashMap<>();
			for(int c = 0; c < cols; c++) {
				String key = sheet.getRow(r).getCell(0).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			excelList.add(map);
		}
		System.out.println(excelList);
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/alexandrrudenko/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		for (Map<String, String> map : excelList) {
			Set <String> user = map.keySet();
			for (String user1 : user) {
				String password = map.get(user1);
				WebElement username = driver.findElement(By.id("txtUsername"));
				WebElement pass = driver.findElement(By.id("txtPassword"));
				username.sendKeys(user1);
				pass.sendKeys(password);
				Thread.sleep(1000);
				WebElement logInButton = driver.findElement(By.cssSelector("input[id = 'btnLogin']"));
				logInButton.click();
				Thread.sleep(1000);
				
				WebElement welcome = driver.findElement(By.xpath("//a[@id = 'welcome']"));
				Thread.sleep(1000);
				String welcomeText = welcome.getText();
				System.out.println(welcomeText);
				welcome.click();
				Thread.sleep(2000);
				
				WebElement logout = driver.findElement(By.xpath("//a[text() = 'Logout']"));
				logout.click();
				
				
				
			}
		}
		
		driver.quit();
		
		
	}
}
