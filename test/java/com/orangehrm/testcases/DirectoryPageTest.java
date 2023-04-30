package com.orangehrm.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangehrm.base.TestBase;
import com.orangehrm.pages.DirectoryPage;


public class DirectoryPageTest extends TestBase {
	
	WebDriver driver;
	 
	DirectoryPage directoryPage;
	
	public DirectoryPageTest() {
		super();
	}

	 @BeforeMethod
	 public void setup() {
	 initialize();
	 directoryPage = new DirectoryPage(driver);
	 
	 }
	
	 @Test
	 public void validateDirectoryPage() {
	 directoryPage.searchInfoInDirectory();
    
	}
	   
	 @AfterMethod
	 public void tearDown() {
	 driver.quit();
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
