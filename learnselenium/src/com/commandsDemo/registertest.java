package com.commandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registertest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		 Thread.sleep(3000);
 driver.navigate().back();
 Thread.sleep(3000);
 driver.navigate().forward();
 Thread.sleep(3000);
 //driver.navigate().to("http://demowebshop.tricentis.com/register");
 driver.navigate().refresh();
 //driver.close();
 //driver.get("http://demowebshop.tricentis.com/register");
 driver.findElement(By.xpath("//input[@id='gender-male']")).click();
 driver.findElement(By.id("FirstName")).sendKeys("srav");
 driver.findElement(By.id("LastName")).sendKeys("kandibanda");
 driver.findElement(By.id("Email")).sendKeys("srav1234@gmail.com");
 driver.findElement(By.id("Password")).sendKeys("marchipoya");
 driver.findElement(By.id("ConfirmPassword")).sendKeys("marchipoya");
 driver.findElement(By.xpath("//input[@id='register-button']")).click();
 String expectedname="demo webstore";
 String actualname=driver.getTitle();
 System.out.println(actualname);
 System.out.println(actualname.length());
 if(expectedname.equals(actualname)){
	 System.out.println("u are on correct page");
 }
 else
 {
	System.out.println("incorrect page");
	}	
String s1=driver.getCurrentUrl();
System.out.println(s1);
String s2=driver.getPageSource();
System.out.println(s2.length());
	}}

