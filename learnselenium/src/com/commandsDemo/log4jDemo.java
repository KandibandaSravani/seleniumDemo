package com.commandsDemo;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jDemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(log4jDemo.class);
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		log.info("application started successfully");
		String expectedtitle="google";
		String actualtitle=driver.getTitle();
		log.warn("check title");
		if(expectedtitle.equals(actualtitle)){
			System.out.println("correct title");
			log.info("correct page");
			driver.close();
		}else
		{
			System.out.println("incorrect page");
		}
	}
}
