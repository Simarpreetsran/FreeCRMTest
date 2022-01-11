package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory - Object Repositories (OR)
	@FindBy(xpath="//span[contains(text(),'Simarpreet Singh')]")
	WebElement userNameDisplay;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink; 
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//Initializing  the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//Creating Homepage methods
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public String verifyUserNameDisplay() {
		return userNameDisplay.getText();
	}
	
	public Boolean verifyUserNameIsDisplay() {
		return userNameDisplay.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}

}
