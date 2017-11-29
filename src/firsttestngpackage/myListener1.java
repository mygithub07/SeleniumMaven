package firsttestngpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import firsttestngpackage.customParameter;

public class myListener1 implements ITestListener {

	String tParam = customParameter.getParams();
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("from custom myListener1:  method"  + "  "+result.getMethod().getMethodName() +"  "+ "passed and custom parameter is " + tParam);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
