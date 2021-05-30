package com.Tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPageClass;

public class LoginTestClass extends BaseTestClass{

	LoginPageClass lp;
	
	@Test
	public void VerifyLoginPageTitle()
	{
		String title=lp.VerifyPageTitle();
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	//similarly do header test and login method run
	
	@Test
	public void Login(String username, String password)
	{
	lp.Login("sankalpa.mehra94@gmail.com", "Sapient@1994");
	WebElement header=lp.getHeader();
	System.out.println(header);
	
	}
	
}
