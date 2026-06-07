package com.CRM.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Utility;

public class HomePage {

	// encapsulation = private data + public method

	private WebDriver driver;

	// initialize driver

	// constructor helps to initialize the object

	public HomePage(WebDriver driver) { //base class driver
		this.driver = driver;

	}

	// data member(locator)

	private By link = By.linkText("Sign In"); // By class object is "link"

	// method(functionality to test)

	public String getAppUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		return driver.getTitle();
	}
	
	public String getStatusOfLink() throws IOException {
		Utility.getScreenshot(driver);
		driver.findElement(link).click();
		Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
}