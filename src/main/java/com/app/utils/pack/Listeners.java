package com.app.utils.pack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.app.pages.pack.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Listeners extends Base implements ITestListener {
	ExtentReports exReports = ExtentReporterNG.extentReportGenerator();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		log.info("Test" + result.getMethod().getMethodName() + "Started");
		test = exReports.createTest("Test has started" + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Successful.." + result.getMethod().getMethodName());
		log.info("Test Passed....!!!!!"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
         log.info("Test Failed....!!!!!"+result.getMethod().getMethodName());
		test.log(Status.FAIL, "Test Failed is " + result.getMethod().getMethodName());
		test.log(Status.FAIL, "Test failed is " + result.getThrowable());
		String temp = takeScreenshot.getScreenshot(driver);
		test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		exReports.flush();

	}

}
