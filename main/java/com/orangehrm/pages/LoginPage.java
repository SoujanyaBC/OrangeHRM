package com.orangehrm.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.orangehrm.base.TestBase;

public class LoginPage extends TestBase {
	
	    WebDriver driver;
		
	    public LoginPage(WebDriver driver){
			
	    this.driver = driver;
	    
		}
		
		public String validateLoginPageTitle() {
			
		return driver.getTitle();
		
		}
		
		public boolean validateOrangeHrmLogo() {
			
		return driver.findElement(By.xpath(prop.getProperty("ohrm_logo"))).isDisplayed();
		
		}
		 
		public void validateLogin() {
			
		driver.findElement(By.xpath(prop.getProperty("username_locator"))).sendKeys(prop.getProperty("ohrm_username_value"));
		
		driver.findElement(By.xpath(prop.getProperty("password_locator"))).sendKeys(prop.getProperty("ohrm_password_value"));
		
		driver.findElement(By.linkText(prop.getProperty("ohrm_login_button"))).click();

		
		}	
	

}



