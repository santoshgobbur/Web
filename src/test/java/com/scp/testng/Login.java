package com.scp.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("before class");
		
	}


	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println(" After class");
		
	}
	
	
	
	@BeforeTest
	public void setUp() {
		
		
		System.out.println("Before Test");
//		System.out.println("Before test");
//		System.setProperty("webdriver.chrome.driver", "Resource\\Chrome\\chromedriver.exe");
//		driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
	
	}
	
	@Test
	public void EnterCredential() {
		
		System.out.println("Test");
	
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		
	}
	
//	@Test
//	public void tt() {
//		System.out.println("Test2");
//	}
	
	@AfterTest
	public void teardown() {
		System.out.println("After test");
		//driver.quit();
	}
	
	
	@BeforeMethod
	public void m() {
		System.out.println("before method");
	}

	
	@AfterMethod
	public void s() {
		System.out.println("after method");
	}
}
