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

public class LoginPage extends DriverScript {
	
//****************************************** Page Elements *****************************************************//
	
	@FindBy(id="username") WebElement textUsername;
	@FindBy(name="pwd") WebElement textPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(id="logoContainer") WebElement imgLogo;
	
//****************************************** Page Initlization *****************************************************//
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//****************************************** Page Actions *****************************************************//
	
	public void enterUsername(String username)
	{
		textUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLogin.click();
	}
	
	public boolean verifyLogo()
	{
		return imgLogo.isDisplayed();
	}

}