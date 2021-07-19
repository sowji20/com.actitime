package com.actitime.testcase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.actitime.base.DriverScript;
import com.actitime.pages.EnterTimePage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TaskPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends DriverScript {
	
	public static ExtentTest logger;
	public static ExtentReports report;
	public static ExtentHtmlReporter extent;
	LoginPage loginpage;
	EnterTimePage entertimepage;
	TaskPage taskpage;
	
	
	@BeforeSuite
	public void setupReport()
	{
		extent = new ExtentHtmlReporter("./actireports/index.html");
		report = new ExtentReports();
		report.attachReporter(extent);	
	}
	
	@BeforeMethod
	public void setUp()
	{
		initDriver();
		loginpage = new LoginPage();
		entertimepage = new EnterTimePage();
		taskpage = new TaskPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.fail("Test Failed");
		}
		
		quitDriver();
	}
	
	@AfterSuite
	public void reportflush()
	{
		report.flush();
	}

}