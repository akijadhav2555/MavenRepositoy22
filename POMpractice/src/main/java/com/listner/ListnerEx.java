package com.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.base.TestBase;

public class ListnerEx  extends TestBase implements ITestListener{

	public void onFinish(ITestContext result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case fail with name"+result.getName());
		String path=screenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test case skip with name"+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case pass with name"+result.getName());
		
	}

}