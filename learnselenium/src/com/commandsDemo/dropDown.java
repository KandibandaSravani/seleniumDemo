package com.commandsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
   // WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
    Select sell=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
    List<WebElement> l=sell.getOptions();
    System.out.println(l.size());
    
    Select sell1=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
    List<WebElement> l1=sell1.getOptions();
    System.out.println(l1.size());
    for(int i=0;i<l1.size();i++)
    System.out.println("month names are:"+l1.get(i).getText());
		

	}

}
