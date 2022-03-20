package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qa.pageobject.Admin;
import com.qa.pageobject.LoginPage;
import com.qa.util.Base;

import junit.framework.Assert;

public class AdminTest extends Base {
	
	LoginPage lp;
	Admin admin;

	public AdminTest(){
		
		super();
		initialiseDriver();
		lp = new LoginPage(driver);
		lp.login();
		lp.clickAdminTab();
		admin = new Admin(driver);
		
	}
	
	@Test
	public void enterSystemUserTest() {
		
		admin.searchUser();
		System.out.println("passed");
	}
	
}
