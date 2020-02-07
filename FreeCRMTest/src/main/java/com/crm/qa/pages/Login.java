package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class Login extends Base {
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	@FindBy(linkText = "SIGN UP")
	WebElement signUp;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click(); 
		return new HomePage();
	}

}
