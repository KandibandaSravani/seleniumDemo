package demoWebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demoWebPOM.LoginPagePOM;
import demoWebPOM.registerPOM;

public class loginAndRegisterTest {
	WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();;
	}

	@Test
	public void registertest()
	{
	registerPOM register=new registerPOM(driver);
	register.linkregister();
	register.selectgender();
	register.enterfirstname("hemanth4");
	register.enterlastname("ramisetty4");
	register.enterEmail("hemanth3993@gamil.com");
	register.enterpassword("yedava");
	register.enterconfirmPassword("yedava");
    register.clickregister();
    String result1=register.result;
    Assert.assertEquals(result1,"Your registration completed");
    //register.checkingtest("Your registration completed");
	}
	
	@Test(priority=1)
	public void login()
	{
		LoginPagePOM login=new LoginPagePOM(driver);
		login.linklogin();
		 login.enterusername("sravani1997@gmail.com");
		   login.enterpassword("telidu");
		   login.clicklogin();
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
	}
}
