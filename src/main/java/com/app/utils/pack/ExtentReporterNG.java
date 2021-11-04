package com.app.utils.pack;

import com.app.pages.pack.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG extends Base {
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("ExtentReport Test");
		reporter.config().setDocumentTitle("ExtentReportTest Results");
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Anu B");
		return extent;
		
	}

}
