package com.commandsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDemo {
	//check the appln with diff values in each iteration

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 FileInputStream fi=new FileInputStream("E:\\dataDrivenTesting\\Book1.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(fi);
		 XSSFSheet sheet=wb.getSheetAt(0);
		 int rowcount=sheet.getLastRowNum();
		 {
			 for(int i=0;i<rowcount;i++)
			 {
				 String username=sheet.getRow(i).getCell(0).getStringCellValue();
				 String password=sheet.getRow(i).getCell(1).getStringCellValue();
				 driver.get("http://demowebshop.tricentis.com/login");
				 driver.manage().window().maximize();
				 driver.findElement(By.name("Email")).sendKeys(username);
				 driver.findElement(By.id("Password")).sendKeys(password);
				   // driver.findElement(By.className("button-1 login-button")).click();
				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();	
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("Log out")).click();
			 }
		 }
	}
}
