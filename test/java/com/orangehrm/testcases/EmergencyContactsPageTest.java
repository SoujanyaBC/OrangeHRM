package com.orangehrm.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangehrm.base.TestBase;
import com.orangehrm.pages.EmergencyContactsPage;

    public class EmergencyContactsPageTest extends TestBase {
	
	WebDriver driver;
	 
	EmergencyContactsPage emergencyContactsPage;
	
	public EmergencyContactsPageTest() {
		super();
	}

	 @BeforeMethod
	 public void setup() {
	 initialize();
	 emergencyContactsPage = new EmergencyContactsPage(driver);
	 
	 }
	
	 @Test
	 public void validateEmergencyContactsPage() {
	 emergencyContactsPage.enterEmergencyContactsInMyInfo();
    
	}
	   
	 @AfterMethod
	 public void tearDown() {
	 driver.quit();
		
	 }
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


