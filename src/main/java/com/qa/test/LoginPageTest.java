package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.qa.pageobject.LoginPage;
import com.qa.util.Base;
import junit.framework.Assert;

public class LoginPageTest extends Base {
    
	public WebDriver driver;
	
	LoginPage lp = new LoginPage(driver);

	public LoginPageTest(){
		
		super();
		initialiseDriver();
		lp = new LoginPage(driver);
	
	}
	@Test(priority=1)
	public void validateTitle(){
	
	    lp.login();
		Assert.assertEquals("OrangeHRM", lp.getTitle());
		
	}
	@Test(priority=2)
	public void validateAdminTabClick(){
	
	    lp.clickAdminTab();
		System.out.println("Admin tab clicked");
		
		
	}

}
