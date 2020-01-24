package com.commandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.automationtesting.in");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'webTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
	}

}
//a[contains(text(),'WebTable')]//ancestor::ul//descendant::a[2][contains(text(),'Register')]
//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]