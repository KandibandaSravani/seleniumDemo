package demoWebPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;
	By username=By.id("Email");
	By password=By.id("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	By loginlink=By.xpath("//a[@class='ico-login']");
	
	public LoginPagePOM(WebDriver driver){
		this.driver=driver;
	}
    public void enterusername(String UN) {
    	driver.findElement(username).sendKeys(UN);
    }
    public void enterpassword(String PWD) {
    	driver.findElement(password).sendKeys(PWD);
    }
    public void clicklogin() {
    	driver.findElement(login).click();
    }
    public void linklogin()
    {
    	driver.findElement(loginlink).click();
    }
}
