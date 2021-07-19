package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.base.DriverScript;

/*
 * Name: LoginPage
 * Developed By: Ibrahim
 * Developed Date: 7/12/2021
 * Verified By : Shantosh
 * Verified Date : 7/13/2021
 * Description: Login Page contains all the login page elements and the actions - Feel free to add or modify the locators
 */


public class EnterTimePage extends DriverScript {
	
//****************************************** Page Elements *****************************************************//
	
	@FindBy(id="container_tasks") WebElement menuTask;
	@FindBy(xpath="//div[@id='container_reports']") WebElement menuReports;
	@FindBy(id="container_users") WebElement menuUsers;
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textLoggedinUser;
	
//****************************************** Page Initialization *****************************************************//
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
//****************************************** Page Initialization *****************************************************//
	
	public void clickTaskMenu()
	{
		menuTask.click();
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	public String getUserLoggedIn()
	{
		return textLoggedinUser.getText();
	}
	
	

}