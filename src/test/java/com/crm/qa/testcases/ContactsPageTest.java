package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	String sheetName= "Contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		contactsPage=new ContactsPage();
		homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();		
	}
	
	@Test
	public void verifyContactsLabelTest() {
		Assert.assertEquals(contactsPage.verifyContactsLabel(), "Contacts", "Contacts page label mismatch");
	}
	
	@Test
	public void verifyContactsLabelIsDisplayedTest() {
		Assert.assertTrue(contactsPage.verifyContactsLabelisDisplayed());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
