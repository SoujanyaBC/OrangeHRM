package com.orangehrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangehrm.base.TestBase;
import com.orangehrm.pages.PersonalDetailsPage;


public class PersonalDetailsPageTest extends TestBase {
	
PersonalDetailsPage personalDetailsPage;
	
	public PersonalDetailsPageTest() {
		super();
	}

	 @BeforeMethod
	 public void setup() {
	 initialize();
	 personalDetailsPage = new PersonalDetailsPage(driver);
	 
	 }
	
	 @Test
	 public void validatePersonalDetailsPage() {
	 personalDetailsPage.enterPersonalDetailsInMyInfo();
     
	}
	   
	 @AfterMethod
	 public void tearDown() {
	 driver.quit();
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
