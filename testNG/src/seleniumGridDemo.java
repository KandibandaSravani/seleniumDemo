

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class seleniumGridDemo {
	public WebDriver driver;
	@Test
	public void verifylogin() throws MalformedURLException 
	{
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://172.24.96.49:1234/wd/hub"),capability);
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		System.out.println(title);
		/*driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();*/
System.out.println("successfully logged in");
	}

}
