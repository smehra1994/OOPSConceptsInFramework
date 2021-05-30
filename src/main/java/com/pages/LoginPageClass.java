package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageClass extends BasePageClass {

	// ENCAPSULATION

	// page locators(can use xpath or findBy too)
	private By emailID = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	//private WebElement e=driver.findElement(By.xpath("//input[@id='abc']"));

	public LoginPageClass(WebDriver driver) { // automatically added once u extend base class
		super(driver);

	}

	// just right click here-select source-generate getter

	public WebElement getEmailID() { // initially there will be "By" instead of Webelement
		return getElement(emailID); // initially it was "return emailID"
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public WebElement getHeader() {
		return getElement(header);
	}

	public String VerifyPageTitle() { // directly calling from my base class which further calls from abstract class
		return getPageTitle();
	}

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}

	public void Login(String username, String password) {
		getEmailID().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();

		// return HomePageClass; //next landing page not created yet
	}

	/*
	 * for my negative testing if i want to pass blank unmae na dpwd and check
	 * output i can apply some if else condition but to make my code clean i can use
	 * METHOD OVERLOADING
	 */

	public void Login() {
		getEmailID().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}

}
