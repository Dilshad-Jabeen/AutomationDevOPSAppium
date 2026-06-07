package com.CRM.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass {
  @Test(priority = 1)
  public void verifyUrl() {
	  
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"), "Test Fail: URL is not Matched!");
	  System.out.println("Test Pass: URL Matched!");	  
  }
  
  
  @Test(priority = 2)
  public void verifyTitle() {
	  
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"), "Test Fail: Title is not Matched!");
	  System.out.println("Test Pass: Title Matched!");
	  
  }
  
  @Test(priority = 3)
  public void validateSignInLink() throws IOException {
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail: LOgin Page not open ");
	  System.out.println("Test Pass: Application navigating to Login page");
	  
  }
}
