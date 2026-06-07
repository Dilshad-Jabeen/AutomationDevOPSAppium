package com.CRM.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.Utility;

public class LoginPage {
	
	private WebDriver driver;
	
	//initialize the driver
	
	public LoginPage(WebDriver driver) {// base class driver
		this.driver = driver;
		
	}
	
	//locators
	
	private By email = By.id("email-id");
	private By pwd = By.id("password");
	private By btnLogin = By.name("submit-name");
	
	
	//method
	public String doLogin(String em, String ps) throws IOException {
		
		driver.findElement(email).sendKeys(em);
		driver.findElement(pwd).sendKeys(ps);
		driver.findElement(btnLogin).click();
		Utility.getScreenshot(driver);
		return driver.getCurrentUrl();
	}
}
