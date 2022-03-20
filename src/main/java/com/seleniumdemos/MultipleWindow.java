package com.seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MultipleWindow {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports ex;
	public ExtentTest test;
	
	@Test
	public void multiWindow() {
		
		System.setProperty("webdriver.firefox.marionette","Resource/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://javadoc.io/doc/io.rest-assured/rest-assured/latest/index.html");
		
		List<WebElement> fs = driver.findElements(By.tagName("iframe"));
		System.out.println(fs.size());
		
//		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver_win32 (3)/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
//		htmlReporter = new ExtentHtmlReporter("Resource/Spicejet.html");
//		 ex = new ExtentReports();
//		 ex.attachReporter(htmlReporter); 
//		test = ex.createTest("Spice Jet");
//		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
//		driver = new ChromeDriver();
//		test.pass("Spice jet application launched");
//		
//		test.pass("browser initiated");
		
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//		driver.close();
		
	}

}
