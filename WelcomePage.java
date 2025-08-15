package com.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Sometimes,WebElement of name or location or locator will be change while we script will not work, so we go for Object Repository.


public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Log in") // Here, LinkText is a locator .
	private WebElement loginLink; // Here, (for Understanding purpose only) >> int B; 
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	@FindBy(id="Email")	
	private WebElement EmailTextField;
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	
	@FindBy(id="Password")// id is not confirm , check once again in webpage 
	private WebElement PasswordTextField;
	
	public WebElement getPasswordTextField() {
		return PasswordTextField;
		
	}
	
	//pending topics 
	// Assertions
	// Listeners
	// Group (like SanityGroup and FunctionalGroup)
	// Multiple data from Excel
	// Object Repostitary
	// Extent report
	

}

