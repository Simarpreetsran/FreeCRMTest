package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{ //Extends parent class (TestBase)
	
	LoginPage loginPage; // Defining LoginPage class variable (loginPage) so it can be used throughout this class. 
	HomePage homepage; // Defining HomePage class variable (homepage) so it can be used throughout this class
	
	public LoginPageTest() {
		super(); // Super keyword will initialize parent class (TestBase) constructor. This constructor will set properties.
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage(); //creating object of LoginPage Class to access LoginPage methods.
	}
	
	@Test (priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test (priority=2)
	public void loginTest() {
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
