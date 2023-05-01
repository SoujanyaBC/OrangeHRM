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

public class PersonalDetailsPage extends TestBase {
	 WebDriver driver;

	  
     public PersonalDetailsPage(WebDriver driver){
	 this.driver = driver;
	     
     }
 
         public void enterPersonalDetailsInMyInfo() {
        	 
    	 try { 
        	 
            WebElement myInfo=driver.findElement(By.xpath(prop.getProperty("my_info")));
	    myInfo.click();
    
	     WebElement profilePicture = driver.findElement(By.xpath(prop.getProperty("profile_picture")));
	     profilePicture.click();
     
	     WebElement changeOfProfilePicture = driver.findElement(By.xpath(prop.getProperty("change_of_profile_picture")));
	     changeOfProfilePicture.click();
	     Robot rob = new Robot();
	     rob.delay(2000);
	     StringSelection sss= new StringSelection(prop.getProperty("picture_1"));
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss,null);
	     rob.keyPress(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_CONTROL);
	     rob.keyRelease(KeyEvent.VK_V);
	     rob.keyPress(KeyEvent.VK_ENTER);
	     rob.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     
	     Actions act = new Actions(driver);
	     act.scrollByAmount(0,300).perform();
             WebElement savebutton=driver.findElement(By.xpath(prop.getProperty("click_on_first_save_button")));
	     savebutton.click();
	     Thread.sleep(2000);
	     
	         driver.navigate().back(); 
		 Thread.sleep(3000);
		 WebElement firstName = driver.findElement(By.xpath(prop.getProperty("first_name")));
		 Thread.sleep(2000);
		 firstName.click();
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_DELETE);
		 robot.keyRelease(KeyEvent.VK_DELETE);
		 Thread.sleep(2000);
		 firstName.sendKeys(prop.getProperty("firstName"));
     
		 WebElement middleName = driver.findElement(By.xpath(prop.getProperty("middle_name")));
		 Thread.sleep(2000);
		 middleName.click();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_DELETE);
		 robot.keyRelease(KeyEvent.VK_DELETE);
		 Thread.sleep(2000);
		 middleName.sendKeys(prop.getProperty("middleName"));
     
		 WebElement lastName = driver.findElement(By.xpath(prop.getProperty("last_name")));
		 Thread.sleep(2000);
		 lastName.click();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_DELETE);
		 robot.keyRelease(KeyEvent.VK_DELETE);
		 Thread.sleep(2000);
		 lastName.sendKeys(prop.getProperty("lastName"));   
     
		 WebElement nickName = driver.findElement(By.xpath(prop.getProperty("nick_name")));
		 Thread.sleep(2000);
		 nickName.click();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_DELETE);
		 robot.keyRelease(KeyEvent.VK_DELETE);
		 Thread.sleep(2000);
		 nickName.sendKeys(prop.getProperty("nickName"));
     
		  WebElement employeeId=driver.findElement(By.xpath(prop.getProperty("employee_id")));
		  Thread.sleep(2000);
		  employeeId.click();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_DELETE);
		  robot.keyRelease(KeyEvent.VK_DELETE);
		  Thread.sleep(2000);
                  employeeId.sendKeys(prop.getProperty("employeeId"));
     
                  WebElement otherId=driver.findElement(By.xpath(prop.getProperty("other_id")));
    	          Thread.sleep(2000);
		  otherId.click();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_DELETE);
		  robot.keyRelease(KeyEvent.VK_DELETE);
		  Thread.sleep(2000);
     
		  WebElement driverLicenseNum =driver.findElement(By.xpath(prop.getProperty("driver_licensenum")));
		  Thread.sleep(2000);
		  driverLicenseNum.click();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_A);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_DELETE);
		  robot.keyRelease(KeyEvent.VK_DELETE);
		  Thread.sleep(2000);
                  driverLicenseNum.sendKeys(prop.getProperty("licenseNum"));
     
   	           WebElement licenseExpiryDate =driver.findElement(By.xpath(prop.getProperty("license_expirydate")));
		   Thread.sleep(2000);
		   licenseExpiryDate.click();
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_A);
		   robot.keyRelease(KeyEvent.VK_A);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_DELETE);
		   robot.keyRelease(KeyEvent.VK_DELETE);
		   Thread.sleep(2000);
                   licenseExpiryDate.sendKeys(prop.getProperty("licenseExpiryNum"));
     
               WebElement ssnNum =driver.findElement(By.xpath(prop.getProperty("ssn_num")));
               Thread.sleep(2000);
	       ssnNum.click();
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_DELETE);
	       robot.keyRelease(KeyEvent.VK_DELETE);
	       Thread.sleep(2000);
               ssnNum.sendKeys(prop.getProperty(""));
     
     
               WebElement sinNum =driver.findElement(By.xpath(prop.getProperty("sin_num")));
               Thread.sleep(2000);
	       sinNum.click();
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_DELETE);
	       robot.keyRelease(KeyEvent.VK_DELETE);
	       Thread.sleep(2000);
               sinNum.sendKeys(prop.getProperty("sinNum"));
     
  
  
           Actions actions = new Actions(driver);
           actions.scrollByAmount(0,200).perform();
           WebElement nationalityDropdown =driver.findElement(By.xpath(prop.getProperty("nationality_dropdown")));
           nationalityDropdown.click();
           Thread.sleep(1000);
           List<WebElement>  allcountries= driver.findElements(By.xpath(prop.getProperty("countries")));
           System.out.println("Number of Country Options : "+ allcountries.size());
           for(WebElement countries: allcountries)
           {
          if(countries.getText().equals(prop.getProperty("Nation")))
           {
           countries.click();
           break;
           }
           }
  
           Thread.sleep(4000);
           WebElement maritalStatus =driver.findElement(By.xpath(prop.getProperty("marital_status_dropdown")));
           maritalStatus.click();
           List<WebElement>  maritalStatuslist= driver.findElements(By.xpath(prop.getProperty("arital_status_dd")));
           System.out.println("Number of Marital Status Options : "+ maritalStatuslist.size());
           for(WebElement maritalstatusoptions: maritalStatuslist)
           {
           if(maritalstatusoptions.getText().equals(prop.getProperty("martialStatus")))
           {
           maritalstatusoptions.click();
           break;
           }
           }
  
  
               WebElement dateOfBirth =driver.findElement(By.xpath(prop.getProperty("date_of_birth")));
               Thread.sleep(2000);
	       dateOfBirth.click();
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_DELETE);
	       robot.keyRelease(KeyEvent.VK_DELETE);
	       Thread.sleep(2000);
	       dateOfBirth.sendKeys(prop.getProperty("date0fBirth"));
	       Thread.sleep(1000);
	       WebElement secondsaveButton=driver.findElement(By.xpath(prop.getProperty("second_save_button")));
               secondsaveButton.click();
  
          
	   Actions act1 = new Actions(driver);
           act1.scrollByAmount(0,600).perform();
           WebElement bloodTypeDropdown =driver.findElement(By.xpath(prop.getProperty("blood_type_dropdown")));
           bloodTypeDropdown.click();
           List<WebElement>  allbloodtypes= driver.findElements(By.xpath(prop.getProperty("blood_dd")));
           System.out.println("Number of Blood Types  : "+ allbloodtypes.size());
           for(WebElement bloodoptions: allbloodtypes)
           {
           if(bloodoptions.getText().equals(prop.getProperty("bloodType")))
           {
           bloodoptions.click();
           break;
                 }
               }
  
  
           Thread.sleep(1000);
	   WebElement thirdsaveButton =driver.findElement(By.xpath(prop.getProperty("third_save_button")));
           thirdsaveButton.click();
  
  
           Thread.sleep(1000);
           WebElement uploadFile = driver.findElement(By.xpath(prop.getProperty("upload_file") ));
           uploadFile.click();
           WebElement browserclick = driver.findElement(By.xpath(prop.getProperty("browser")));
           browserclick.click();
           Robot rb = new Robot();
           rb.delay(2000);
           StringSelection ss= new StringSelection(prop.getProperty("file_path_1"));
           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_V);
           rb.keyRelease(KeyEvent.VK_CONTROL);
           rb.keyRelease(KeyEvent.VK_V);
           rb.keyPress(KeyEvent.VK_ENTER);
           rb.keyRelease(KeyEvent.VK_ENTER);
           
   	} catch (InterruptedException e) {
   	e.printStackTrace();
   	} catch (AWTException e) {
	e.printStackTrace();
	}
  
     
     }
     
     
     
     
     
     
     
     
     
     
     
     
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
