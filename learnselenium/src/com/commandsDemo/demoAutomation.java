package com.commandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoAutomation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("hemanth");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("krishna");
    driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("hyd");//give absolute/relative path
    driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9876543210");	 
    driver.findElement(By.xpath("//input[@name='radiooptions' and @value='Male']")).click();
    //driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[2]/label[1]")).click();
    //driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]")).isSelected();
    WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));//for dropbox
    Select sell=new Select(year);
    sell.selectByVisibleText("1997");
	
	}

}
