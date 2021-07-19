package com.actitime.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCustomerTest extends BaseTest {
	
	@Test
	public void testCreateCustomer()
	{
		logger=report.createTest("Create New Customer Test");
		
		loginpage.enterUsername("admin");
		logger.info("entered the username");
		loginpage.enterPassword("manager");
		logger.info("entered the password");
		loginpage.clickLogin();
		logger.info("clicked login button");
		
		String actual = entertimepage.getUserLoggedIn();
		Assert.assertTrue(actual.contains("John"));
		System.out.println(actual);
		logger.pass("user logged in successfully");
		entertimepage.clickTaskMenu();
		logger.info("clicked on taskmenu");
		String title = taskpage.getTitle();
		Assert.assertTrue(title.contains("Task"));
		System.out.println(title);
		logger.pass("successfully navigated to task page");
		taskpage.clickAddNew();
		logger.info("clicked add new button");
		taskpage.clickAddNewCustomer();
		logger.info("clicked add new customer option");
		taskpage.enterCustomerName("Test Customer2");
		logger.info("entered customer name");
		taskpage.enterCustomerDescription("Test Description2");
		logger.info("entered customer description");
		taskpage.clickCreateCustomer();
		logger.info("clicked on create customer");
		String message = taskpage.verifySuccessMessage();
		System.out.println(message);
		Assert.assertTrue(message.contains("created"));
		logger.pass("successfully created the user");
		entertimepage.clickLogout();
		logger.info("clicked logout");
	}

}