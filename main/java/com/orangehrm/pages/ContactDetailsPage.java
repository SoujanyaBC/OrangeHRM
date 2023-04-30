package com.orangehrm.pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.base.TestBase;

public class ContactDetailsPage extends TestBase {
	
	 WebDriver driver;

	  
     public ContactDetailsPage(WebDriver driver){
	 this.driver = driver;
	     
     }
 
     public void enterContactDetailsInMyInfo() {
        	 
    	 try { 
        	 
    		     Thread.sleep(2000);
	             driver.navigate().to(prop.getProperty("value_1"));	
	             Thread.sleep(1000);
			     WebElement street1Address=driver.findElement(By.xpath(prop.getProperty("street_1")));
			     Thread.sleep(2000);
		         street1Address.click();
			     Robot robot=new Robot();
			     robot.keyPress(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_A);
			     robot.keyRelease(KeyEvent.VK_A);
			     robot.keyRelease(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_DELETE);
			     robot.keyRelease(KeyEvent.VK_DELETE);
			     Thread.sleep(2000);
			     street1Address.sendKeys(prop.getProperty("value_2"));
			  
			     Thread.sleep(1000);
		         WebElement street2Address=driver.findElement(By.xpath(prop.getProperty("street_2")));
		         Thread.sleep(2000);
				 street2Address.click();
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_DELETE);
				 robot.keyRelease(KeyEvent.VK_DELETE);
				 Thread.sleep(2000);
				 street2Address.sendKeys(prop.getProperty("value_3"));
    		 
				 Thread.sleep(1000);
				 WebElement cityAddress=driver.findElement(By.xpath(prop.getProperty("city_1")));
				 Thread.sleep(2000);
				 cityAddress.click();
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_DELETE);
				 robot.keyRelease(KeyEvent.VK_DELETE);
				 Thread.sleep(2000);
				 cityAddress.sendKeys(prop.getProperty("value_4"));
    		 
    		 
				 Thread.sleep(1000);
				 WebElement stateDetails=driver.findElement(By.xpath(prop.getProperty("state_1")));
				 Thread.sleep(2000);
				 stateDetails.click();
				 Robot robot2=new Robot();
				 robot2.keyPress(KeyEvent.VK_CONTROL);
				 robot2.keyPress(KeyEvent.VK_A);
				 robot2.keyRelease(KeyEvent.VK_A);
				 robot2.keyRelease(KeyEvent.VK_CONTROL);
				 robot2.keyPress(KeyEvent.VK_DELETE);
				 robot2.keyRelease(KeyEvent.VK_DELETE);
				 Thread.sleep(2000);
				 stateDetails.sendKeys(prop.getProperty("value_5"));
    		 
				 WebElement postalCode=driver.findElement(By.xpath(prop.getProperty("postal_code_1")));
				 Thread.sleep(2000);
				 postalCode.click();
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_A);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_DELETE);
				 robot.keyRelease(KeyEvent.VK_DELETE);
				 Thread.sleep(2000);
				 postalCode.sendKeys(prop.getProperty("value_6"));
				 Thread.sleep(1000);
    		 
				  Actions actions=new Actions(driver);
				  actions.scrollByAmount(0, 200);
				  Thread.sleep(2000);
				  WebElement countryDropdown=driver.findElement(By.xpath(prop.getProperty("country_dropdown_1")));
				  countryDropdown.click();
				  List<WebElement>  allcountries= driver.findElements(By.xpath(prop.getProperty("countries_3")));
				  System.out.println("Number of Country Options : "+ allcountries.size());
				  for(WebElement countries: allcountries)
				  {
				  if(countries.getText().equals(prop.getProperty("value_7")))
				  {
				  countries.click();
				  break;
				  }
				  }
				  
				    Thread.sleep(1000);
				    WebElement homeNum=driver.findElement(By.xpath(prop.getProperty("home_num_1")));
				    Thread.sleep(2000);
					homeNum.click();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_DELETE);
					Thread.sleep(2000);
				    homeNum.sendKeys(prop.getProperty("value_8"));
    		 
				    Thread.sleep(1000);
				    WebElement mobileNum=driver.findElement(By.xpath(prop.getProperty("mobile_num_1")));
				    Thread.sleep(2000);
					mobileNum.click();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_DELETE);
					Thread.sleep(2000);
				    mobileNum.sendKeys(prop.getProperty("value_9"));
    		 
    		 
				    Thread.sleep(1000);
				    WebElement workNum=driver.findElement(By.xpath(prop.getProperty("work_num_1")));
				    Thread.sleep(2000);
					workNum.click();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_DELETE);
					robot.keyRelease(KeyEvent.VK_DELETE);
					Thread.sleep(2000);
				    workNum.sendKeys(prop.getProperty("value_0"));
    		 
    		 
				    Thread.sleep(1000);
				    WebElement workEmail=driver.findElement(By.xpath(prop.getProperty("workemail")));
				    Thread.sleep(2000);
					workEmail.click();
					Robot robot7=new Robot();
					robot7.keyPress(KeyEvent.VK_CONTROL);
					robot7.keyPress(KeyEvent.VK_A);
					robot7.keyRelease(KeyEvent.VK_A);
					robot7.keyRelease(KeyEvent.VK_CONTROL);
					robot7.keyPress(KeyEvent.VK_DELETE);
					robot7.keyRelease(KeyEvent.VK_DELETE);
					Thread.sleep(2000);
				    workEmail.sendKeys(prop.getProperty("value_0_0"));
    		 
				    Thread.sleep(1000);
				    WebElement otherEmail=driver.findElement(By.xpath(prop.getProperty("other_email_1")));
				    Thread.sleep(2000);
					otherEmail.click();
					Robot robot5=new Robot();
					robot5.keyPress(KeyEvent.VK_CONTROL);
					robot5.keyPress(KeyEvent.VK_A);
					robot5.keyRelease(KeyEvent.VK_A);
					robot5.keyRelease(KeyEvent.VK_CONTROL);
					robot5.keyPress(KeyEvent.VK_DELETE);
					robot5.keyRelease(KeyEvent.VK_DELETE);
					Thread.sleep(2000);
				    otherEmail.sendKeys(prop.getProperty("value_1_1"));
    		 
    		 
				    Thread.sleep(1000);
				    WebElement saveButton=driver.findElement(By.xpath(prop.getProperty("save_button_0")));
				    saveButton.click();
				    Thread.sleep(1000);
			        WebElement uploadFile = driver.findElement(By.xpath(prop.getProperty("upload_8")));
		 	        uploadFile.click();
		 	        WebElement browserclick = driver.findElement(By.xpath(prop.getProperty("browser_9")));
		 	        browserclick.click();
		 	        Robot rb = new Robot();
		 	        rb.delay(2000);
		 	        StringSelection ss= new StringSelection(prop.getProperty("value_2_2"));
		 	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		 	        rb.keyPress(KeyEvent.VK_CONTROL);
		 	        rb.keyPress(KeyEvent.VK_V);
		 	        rb.keyRelease(KeyEvent.VK_CONTROL);
		 	        rb.keyRelease(KeyEvent.VK_V);
		 	        rb.keyPress(KeyEvent.VK_ENTER);
		 	        rb.keyRelease(KeyEvent.VK_ENTER);
    		 
		 	        Thread.sleep(1000);
			        Actions actions1=new Actions(driver);
		 	        actions1.scrollByAmount(0,300);
				    WebElement secondsaveButton=driver.findElement(By.xpath(prop.getProperty("second_save_button_0")));
				    secondsaveButton.click();
    	           } catch (InterruptedException e) {
 			
				   e.printStackTrace();
			     } catch (AWTException e) {
			 
			     e.printStackTrace();
		}
		
    		 
}
}