package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.pages.BasePageClass;
import com.pages.abstractPageClass;

public class BaseTestClass {

	WebDriver driver;
	public abstractPageClass page;

	@BeforeMethod
	@Parameters(value = { "browser" }) // passing from Testng file
	public void setUp(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C://Users/sanka/Documents/ChromeDriverEXE/new/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Users/sanka/Documents/FireFoxEXE/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://app.hubspot.com/login?");
		Thread.sleep(3000);
		page=new BasePageClass(driver);   //mandatory step in case of abstract class as i initiate driver there an di need it everywhere so i create refrence with its child class
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
