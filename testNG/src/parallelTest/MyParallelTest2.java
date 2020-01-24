package parallelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyParallelTest2 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
		
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	}
	else {
		throw new Exception("browser is not correct");
	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


@Test
public void login() throws InterruptedException
{
driver.get("http://demowebshop.tricentis.com/login");
driver.manage().window().maximize();
driver.findElement(By.name("Email")).sendKeys("sravani1997@gmail.com");
driver.findElement(By.id("Password")).sendKeys("telidu");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
@AfterTest
public void endTest() {
driver.quit();
}}














