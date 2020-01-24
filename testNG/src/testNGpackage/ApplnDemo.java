package testNGpackage;

import org.testng.annotations.Test;

public class ApplnDemo {
	@Test                  //default priority=0
	public void startapp()
	{
		System.out.println("start appln");
	}
	//@Test(priority=1) 
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("login");
	}
	//@Test(priority=2)
	@Test(dependsOnMethods="login")
	public void logoff()
	{
		System.out.println("logout of appln");
	}
	

}
