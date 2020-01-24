package com.commandsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert alert1=driver.switchTo().alert();
	String alerttitle=driver.switchTo().alert().getText();//storing alerttitle
	System.out.println("alert title is:"+alerttitle);
	Thread.sleep(3000);
	alert1.accept();//clicks the ok button
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("sravani");
		Thread.sleep(3000);
		alert3.accept();
		
		
	}

}
