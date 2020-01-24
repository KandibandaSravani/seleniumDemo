package demoWebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoWebPOM.LoginPagePOM;

public class VerifyLogin {
	@Test
	public void checklogin(){
	    System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   driver.get("http://demowebshop.tricentis.com/login");
	   driver.manage().window().maximize();
	   LoginPagePOM login = new LoginPagePOM(driver);
	   login.enterusername("sravani1997@gmail.com");
	   login.enterpassword("telidu");
	   login.clicklogin();

}}
