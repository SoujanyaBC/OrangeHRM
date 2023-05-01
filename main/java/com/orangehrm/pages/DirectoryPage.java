package com.orangehrm.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.orangehrm.base.TestBase;

public class DirectoryPage extends TestBase {
	WebDriver driver;

	  
    public DirectoryPage(WebDriver driver){
	 this.driver = driver;
	     
    }

    public void searchInfoInDirectory() {
       	 
   	 try { 
	
   	driver.navigate().to((prop.getProperty("D_Value_1")));
   	WebElement employeeName=driver.findElement(By.xpath(prop.getProperty("D_Locator_1")));
	employeeName.sendKeys();
	WebElement jobTitleDropdown =driver.findElement(By.xpath(prop.getProperty("D_Locator_2")));
	jobTitleDropdown.click();
        Thread.sleep(1000);
        List<WebElement>  jobtitles= driver.findElements(By.xpath(prop.getProperty("D_Locator_3")));
        System.out.println("Number of Job Titles : "+ jobtitles.size());
        for(WebElement jobtitle: jobtitles)
        {
        if(jobtitle.getText().equals(prop.getProperty("D_Value_2")))
        {
        jobtitle.click();
        break;
        }

        }
        WebElement locationDropdown =driver.findElement(By.xpath(prop.getProperty("D_Locator_4")));
        locationDropdown.click();
        Thread.sleep(1000);
        List<WebElement>  locations= driver.findElements(By.xpath(prop.getProperty("D_Locator_5")));
        System.out.println("Number of Locations : "+ locations.size());
        for(WebElement location: locations)
        {
        if(location.getText().equals(prop.getProperty("D_Value_3")))
        {
        location.click();
        break;
        }

        }
        Thread.sleep(2000);
	WebElement searchButton=driver.findElement(By.xpath(prop.getProperty("D_Locator_6")));
	searchButton.click();
	Thread.sleep(2000);
	WebElement resetButton=driver.findElement(By.xpath(prop.getProperty("D_Locator_7")));
	resetButton.click();
	Thread.sleep(1000);
	WebElement userdropdownlist= driver.findElement(By.xpath(prop.getProperty("D_Locator_8")));
	userdropdownlist.click();
	Thread.sleep(1000);
	WebElement logoutClick= driver.findElement(By.xpath(prop.getProperty("D_Locator_9")));
	Actions actions =new Actions (driver);
	actions.moveToElement(logoutClick).click().perform();
	
	
        } catch (InterruptedException e) {
		
		e.printStackTrace();
	 
        }

        }}
