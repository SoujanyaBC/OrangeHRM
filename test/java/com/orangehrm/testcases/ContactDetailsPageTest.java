package com.orangehrm.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangehrm.base.TestBase;
import com.orangehrm.pages.ContactDetailsPage;


public class ContactDetailsPageTest extends TestBase {
	 WebDriver driver;
	 
     ContactDetailsPage contactDetailsPage;
	
	public ContactDetailsPageTest() {
		super();
	}

	 @BeforeMethod
	 public void setup() {
	 initialize();
	 contactDetailsPage = new ContactDetailsPage(driver);
	 
	 }
	
	 @Test
	 public void validateContactDetailsPage() {
	 contactDetailsPage.enterContactDetailsInMyInfo();
     
	}
	   
	 @AfterMethod
	 public void tearDown() {
	 driver.quit();
		
	 }
	

}
