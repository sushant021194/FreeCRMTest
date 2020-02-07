package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.Base;
import com.crm.qa.pages.Login;

public class LoginPageTest extends Base {
	Login loginPage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new Login();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
