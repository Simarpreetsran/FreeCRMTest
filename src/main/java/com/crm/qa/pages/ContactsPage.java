package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']") 
	WebElement contactsLabel;
	
	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")
	WebElement createContactButton;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="status")
	WebElement statusOption;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveButton;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyContactsLabel() {
		return contactsLabel.getText();
	}
	
	public Boolean verifyContactsLabelisDisplayed() {
		return contactsLabel.isDisplayed();
	}
	
	public void clickCreateContactButton() {
		createContactButton.click();
	}
	
	public void createNewContact(String stts, String ftName, String ltName) {
		//Select select = new Select(driver.findElement(By.name("status")));
		//select.deselectByVisibleText(stts);
		//statusOption.click();
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveButton.click();
		
	}
	
	
 
}
