package com.orangehrm.selniumuiframework.gernericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class ListenersImplementation  implements ITestListener,ITestResult{
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("/Reports/test_result.html");
	ExtentTest test;
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		 ExtentTest et = extent.createTest( result.getMethod().getMethodName());
		 
	}
	
	

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test Status : Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test Status : Fail");
		test.fail(result.getThrowable());
		ScreenshotUtility sc=new ScreenshotUtility(driver);
		
		try {
			sc.captureScreenshot(driver,result.getMethod().getMethodName());		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip("Test status : skip");
	}
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
	


