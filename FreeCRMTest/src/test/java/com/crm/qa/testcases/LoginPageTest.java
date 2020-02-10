package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Login;

public class LoginPageTest extends Base {
	Login loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeTest
	public void setUp()
	{
		initialization();
		loginPage = new Login();
	}
	@Test
	public void login()
	{
		homePage=Login.login(Base.prop.getProperty("username"),Base.prop.getProperty("password"));
		
	}
	

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
