package com.qa.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Admin {
	
	WebDriver driver;
   	
	@FindBy(id="ohrmList_chkSelectRecord_10")
	WebElement checkbox;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement userName;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement userRole;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="searchSystemUser_status")
	WebElement status;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	
	public Admin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    public void searchUser() {
    	
    	userName.sendKeys("adash");
    	Select userroleDropdown = new Select(userRole);
    	userroleDropdown.selectByVisibleText("ESS");
    
    	Select statusDropdown = new Select(status);
    	statusDropdown.selectByVisibleText("Enabled");
    	
    	searchBtn.click();
    
   }
 
}


