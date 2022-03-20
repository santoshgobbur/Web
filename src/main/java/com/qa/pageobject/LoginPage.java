package com.qa.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Base;

public class LoginPage extends Base {
	
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pwd;
	
	@FindBy(id="btnLogin")
	WebElement loginbtn;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
		
	
	public Admin admin;
 
	public LoginPage(WebDriver driver){

		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
    
	public void login(){
	
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		loginbtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  	
	}
	
	public String getTitle() {
		
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}
	
	public Admin clickAdminTab() {
		
		
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(adminTab));
		adminTab.click();
		return admin;
	}
	
}
