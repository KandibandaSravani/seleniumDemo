package parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class myParallelTest {
	@Test
	public void test1()
	{
	 System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   // driver.get("http://demowebshop.tricentis.com/login");
	    driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("Email")).sendKeys("sravani1997@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("telidu");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
	}
	@Test
	public void test2()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver ff=new FirefoxDriver();
	    ff.get("http://demowebshop.tricentis.com/login");
	    ff.manage().window().maximize();
	    ff.findElement(By.name("Email")).sendKeys("sravani1997@gmail.com");
	    ff.findElement(By.id("Password")).sendKeys("telidu");
	   // driver.findElement(By.className("button-1 login-button")).click();
	ff.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	ff.close();
	}
}