package suitelevelMylistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylistener implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("testcase started"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
