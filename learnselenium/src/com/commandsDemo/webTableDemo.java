package com.commandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Documents/sravani.html");
		String str=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(str);
		

	}

}
