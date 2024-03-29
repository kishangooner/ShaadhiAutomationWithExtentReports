package com.shaadhi.automation.ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//**********************************************************************************************************
//Author: Onur Baskirt
//Description: This is the main listener class.
//**********************************************************************************************************
public class TestListner  implements ITestListener {

  //Extent Report Declarations
  private static ExtentReports extent = ExtentManager.createInstance();
  private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
  
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println((result.getMethod().getMethodName() + " started!"));
    ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
    test.set(extentTest);
	
}
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println((result.getMethod().getMethodName() + " passed!"));
    test.get().pass("Test passed");
	
}
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println((result.getMethod().getMethodName() + " failed!"));
    test.get().fail(result.getThrowable());
}
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println((result.getMethod().getMethodName() + " skipped!"));
    test.get().skip(result.getThrowable());
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
}
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("Extent Reports Version 3 Test Suite started!");
}
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println(("Extent Reports Version 3  Test Suite is ending!"));
    extent.flush();
}

 


}