package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.base.DriverScript;

/*
 * Name: TaskPage
 * Developed By: 
 * Developed Date:
 * Reviewed By and Date:
 */

public class TaskPage extends DriverScript {
	
//****************************************** Page Initialization *****************************************************//
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//****************************************** Page Elements *****************************************************//
	
	@FindBy(className="addNewButton") WebElement buttonAddNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement optionAddNewCustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement textEnterCustomerName;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement textCustomerDescription;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement textSuccessMessage;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement searchBox;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='title']") WebElement searchedItem;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement editButton;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']") WebElement actionsButton;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']") WebElement deleteButton;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement deletePermanentlyButton;
	
//****************************************** Page Actions *****************************************************//
	
	
	public void enterSearchText(String searchText)
	{
		searchBox.sendKeys(searchText);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSearchedResult()
	{
		searchedItem.click();
	}
	
	public void clickEditButton()
	{
		editButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickDeleteButton()
	{
		deleteButton.click();
	}
	
	public void clickDeletePermanentlyButton()
	{
		deletePermanentlyButton.click();
	}
	
	public void clickActionsButton()
	{
		actionsButton.click();
	}
	
	
	public String verifySuccessMessage()
	{
		return textSuccessMessage.getText();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void clickAddNew()
	{
		buttonAddNew.click();
	}
	
	public void clickAddNewCustomer()
	{
		optionAddNewCustomer.click();
	}
	
	public void enterCustomerName(String customername)
	{
		textEnterCustomerName.sendKeys(customername);
	}
	
	public void enterCustomerDescription(String customerdescription)
	{
		textCustomerDescription.sendKeys(customerdescription);
	}
	
	public void clickCreateCustomer()
	{
		buttonCreateCustomer.click();
	}
	


}