package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alwaysRunDemo {
	WebDriver driver;
	@Test
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.navigate().to("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    System.out.println("start appln");
	}
	
	@Test(dependsOnMethods="startapp")
	public void checktitle()
	{
		driver.findElement(By.name("Email")).sendKeys("sravani1997@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("telidu");
	   // driver.findElement(By.className("button-1 login-button")).click();
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	String expectedname="demo webstore";
	 String actualname=driver.getTitle();
	 System.out.println(actualname);
	 Assert.assertEquals(expectedname, actualname);
	 driver.findElement(By.linkText("Log out")).click();
	 System.out.println("logout of appln");
	}
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logout()
	{
		driver.close();
	}
	}
	
