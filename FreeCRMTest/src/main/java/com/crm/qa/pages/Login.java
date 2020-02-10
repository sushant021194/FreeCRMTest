package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class Login extends Base {
	@FindBy(name = "email")
	static
	WebElement username;
	
	@FindBy(name = "password")
	static
	WebElement password;
	
	@FindBy(xpath = "//div[@text='Login']")
	static
	WebElement login;

	@FindBy(linkText="LOG IN")
	static
	WebElement homeLoginButton;
	
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static HomePage login(String un, String pwd)
	{
		homeLoginButton.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click(); 
		return new HomePage();
	}

}
