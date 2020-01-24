package groupsPackage;

import org.testng.annotations.Test;

public class TestGroup1 {
	
@Test(groups={"regression"})
public void test1()
{
	System.out.println("first regression");
}
@Test(groups={"smoke"})
public void test2()
{
	System.out.println("first smoke test");
}

}
