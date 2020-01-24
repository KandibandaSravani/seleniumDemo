package demoWebPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//String expectedname="Your registration is completed";
//String result=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
//Assert.assertEquals(result,expectedname);
public class registerPOM {
	static WebDriver driver;
	By gender=By.xpath("//div[@class='inputs']//div[1]");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By confirmPassword=By.id("ConfirmPassword");
	By Register=By.id("register-button");
	By registerlink=By.xpath("//a[@class='ico-register']");
	public static By check=By.xpath("//div[contains(text(),'Your registration completed')]");
	public static String result=driver.findElement(check).getText();

	public registerPOM (WebDriver driver){
		this.driver=driver;
	}
	 public void selectgender() {
	    driver.findElement(gender);
	    }
	 public void enterfirstname(String FN) {
	    	driver.findElement(firstname).sendKeys(FN);
	    }
	 public void enterlastname(String LN) {
	    	driver.findElement(lastname).sendKeys(LN);
	    }
	 public void enterEmail(String Em) {
	    	driver.findElement(email).sendKeys(Em);
	    }
	 public void enterpassword(String PWD) {
	    	driver.findElement(password).sendKeys(PWD);
	    }
	 public void enterconfirmPassword(String CPWD) {
	    	driver.findElement(confirmPassword).sendKeys(CPWD);
	    }
	
	 public void clickregister() {
	    	driver.findElement(Register).click();
	    }
	 public void linkregister()
	 {
		 driver.findElement(registerlink).click();
	 }
	// public void checkingtest(String Expectedname)
	 //{
		//String result=driver.findElement(check).getText();
		//Assert.assertEquals(result,Expectedname); 
	//}
}
