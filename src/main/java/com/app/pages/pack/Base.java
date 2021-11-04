package com.app.pages.pack;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class);
	
	
	
	@BeforeMethod
	public void SetUp() {
		
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		log.info("Launching URL");
		driver.get("https://www.google.com");
		
	}
	@AfterMethod
	public void teardown() {
		log.info("Closing Browser....!!!!!");
		driver.close();
		
	}

}
