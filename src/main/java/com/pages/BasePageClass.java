package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePageClass extends abstractPageClass{

//once u extent abstract class it will show option to add constructor and unimplemented methods.Just click	
	
	public BasePageClass(WebDriver driver) {
		super(driver);

	}
	

	@Override                  
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
	WebElement element=null;
	//Exception Handling 
	try {
		element=driver.findElement(locator);
		return element;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Error is :" + locator.toString());
	}
	return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Error is :" + locator.toString());    //to publish locator
		}
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Error is :" + title);    
		}
	}

}
