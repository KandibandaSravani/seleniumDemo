package com.commandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionnsDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("selenium");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	 

	}

}
