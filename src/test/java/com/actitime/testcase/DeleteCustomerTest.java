package com.actitime.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCustomerTest extends BaseTest {
	
	@Test
	public void testDeleteCustomer()
	{
		logger=report.createTest("Delete Customer Test");
		
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
		
		taskpage.enterSearchText("Test Customer");
		logger.info("entered customer to search");
		taskpage.clickSearchedResult();
		logger.info("clicked on search box result");
		taskpage.clickEditButton();
		logger.info("clicked on edit button");
		taskpage.clickActionsButton();
		logger.info("clicked on action button");
		taskpage.clickDeleteButton();
		logger.info("clicked on delete button");
		taskpage.clickDeletePermanentlyButton();
		logger.info("clicked on delete permanently button");
		
		String message = taskpage.verifySuccessMessage();
		System.out.println(message);
		Assert.assertTrue(message.contains("Customer"));
		logger.pass("successfully deleted the user");
		entertimepage.clickLogout();
		logger.info("clicked logout");
	
	}
}