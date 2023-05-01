package com.orangehrm.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.orangehrm.base.TestBase;

public class EmergencyContactsPage extends TestBase {
	WebDriver driver;

	  
    public EmergencyContactsPage(WebDriver driver){
	 this.driver = driver;
	     
    }

    public void enterEmergencyContactsInMyInfo() {
       	 
   	 try { 
   		Thread.sleep(3000);
		driver.navigate().to(prop.getProperty("E_Value_1"));
		Thread.sleep(1000);
		WebElement addButtonclick=driver.findElement(By.xpath(prop.getProperty("E_Locator_1")));
		addButtonclick.click(); 
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.xpath(prop.getProperty("E_Locator_2")));
		name.sendKeys(prop.getProperty("E_Value_2"));
		Thread.sleep(1000);
		WebElement homeTelephone=driver.findElement(By.xpath(prop.getProperty("E_Locator_3")));
		homeTelephone.sendKeys(prop.getProperty("E_Value_3"));
		Thread.sleep(1000);
		WebElement mobileNumber = driver.findElement(By.xpath(prop.getProperty("E_Locator_4")));
		mobileNumber.sendKeys(prop.getProperty("E_Value_4"));
		Thread.sleep(1000);
		WebElement workTelephone=driver.findElement(By.xpath(prop.getProperty("E_Locator_5")));
		workTelephone.sendKeys(prop.getProperty("E_Value_5"));
		Thread.sleep(1000);
		WebElement saveButton=driver.findElement(By.xpath(prop.getProperty("E_Locator_6")));
		saveButton.click();
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0,500);
		Thread.sleep(1000);
		
	        WebElement uploadFile2 = driver.findElement(By.xpath(prop.getProperty("E_Locator_7")));
	        uploadFile2.click();
	        WebElement browserclick2 = driver.findElement(By.xpath(prop.getProperty("E_Locator_8")));
	        browserclick2.click();
	        Robot rob = new Robot();
	        rob.delay(2000);
	        StringSelection sss= new StringSelection(prop.getProperty("E_Value_6"));
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss,null);
	        rob.keyPress(KeyEvent.VK_CONTROL);
	        rob.keyPress(KeyEvent.VK_V);
	        rob.keyRelease(KeyEvent.VK_CONTROL);
	        rob.keyRelease(KeyEvent.VK_V);
	        rob.keyPress(KeyEvent.VK_ENTER);
	        rob.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(1000);
		 
           WebElement secondsaveButton=driver.findElement(By.xpath(prop.getProperty("E_Locator_9")));
	   secondsaveButton.click();
	
        } catch (InterruptedException e) {
		
		e.printStackTrace();
	    } catch (AWTException e) {
			
			e.printStackTrace();
		} 
		
       }
	
	
	
	
   	 }


