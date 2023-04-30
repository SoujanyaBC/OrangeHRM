package com.orangehrm.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.TestBase;
import com.orangehrm.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	WebDriver driver;

    LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}

    @BeforeMethod
	public void setup() {
	initialize();
	loginPage = new LoginPage(driver);
	
	}
	
    @Test(priority=1)
	public void loginPageTitleTest() {
	String title = loginPage.validateLoginPageTitle();
	String expectedTitle = prop.getProperty("expected_title");
	Assert.assertEquals(title,expectedTitle);
	
	}	
    
    @Test(priority=2)
	public void webmathLogoTest() {
	boolean flag = loginPage.validateOrangeHrmLogo();
	Assert.assertTrue(flag);
	}
	    
    @Test(priority=3)
	public void loginTest() {
    loginPage.validateLogin();
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
		
	}
	 
	
}
	
	
