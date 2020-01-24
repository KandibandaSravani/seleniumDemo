package com.commandsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCount {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	List<WebElement>linklist=driver.findElements(By.tagName("a"));
    System.out.println("number of links:"+linklist.size());
    for(int i=0;i<linklist.size();i++)
	System.out.println("link names are:"+linklist.get(i).getText());
	    
	    
	}

}
