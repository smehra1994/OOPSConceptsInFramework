package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class abstractPageClass {

	WebDriver driver;
	WebDriverWait wait;
	
	//ABSTRACT CLASS
	public abstractPageClass(WebDriver driver)       //allowed to create constructor of abstract class
	{
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver,15);
	}
	
	//abstract methods
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	
}
