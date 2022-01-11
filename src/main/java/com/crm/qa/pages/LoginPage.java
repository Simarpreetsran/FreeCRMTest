package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - Object Repositories (OR)
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class = 'ui fluid large blue submit button']")
	 WebElement loginbutton; 
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignUpbutton;
	
	//Initializing  the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this); // "this" keyword is pointing to current class objects.
		                                        // We can use LoginPage.class as well
	}
	
	//Actions or Features available on login Page.
	public String validateLoginPageTitle() {
		return driver.getTitle();               //As the return type is String we use public static String and not void.
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new HomePage();  // Once we click login page we will land on home page.
		                        // So login method should return HomePage object. Thats why return type is HomePage. 
	}
	
 
}
