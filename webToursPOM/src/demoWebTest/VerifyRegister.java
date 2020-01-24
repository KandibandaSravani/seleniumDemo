package demoWebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebPOM.LoginPagePOM;
import demoWebPOM.registerPOM;

public class VerifyRegister {
		@Test
		public void checklogin(){
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		registerPOM register=new registerPOM(driver);
	 // LoginPagePOM login=new LoginPagePOM(driver);
		register.selectgender();
		register.enterfirstname("hemanth");
		register.enterlastname("ramisetty");
		register.enterEmail("hemanth@gamil.com");
		register.enterpassword("yedava");
		register.enterconfirmPassword("yedava");
	    register.clickregister();
		  // driver.get("http://demowebshop.tricentis.com/login");
		//  login.enterusername("hemanth@gamil.com");//for register and login simultaneously
		//  login.enterpassword("yedava");
		//   login.clicklogin();
	
		}
}
