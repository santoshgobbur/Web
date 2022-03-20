package com.stepdef;

import org.openqa.selenium.WebDriver;
import com.qa.pageobject.LoginPage;
import com.qa.util.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginFeature {

  
	WebDriver driver;
	LoginPage lp = new LoginPage(driver);
  
	@When("^user launch application$")
	public void user_launch_application(){
	    
		Base.initialiseDriver();
	}

	@And("^user enter credential$")
	public void user_enter_credential(){

	    lp.login();
	}

}
