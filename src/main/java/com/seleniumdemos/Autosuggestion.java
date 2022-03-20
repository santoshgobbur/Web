package com.seleniumdemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resource\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
//		
//		WebElement tab = driver.findElement(By.id("menu_admin_viewAdminModule"));
//		WebDriverWait w = new WebDriverWait(driver,5);
//		w.until(ExpectedConditions.elementToBeClickable(tab));
//		tab.click();
//		
//		WebElement empName =  driver.findElement(By.id("searchSystemUser_employeeName_empName"));
//		empName.sendKeys("Ananya Dash");
//		empName.sendKeys(Keys.ARROW_DOWN);
//		empName.sendKeys(Keys.ENTER);
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//WebElement w = driver.findElement(By.cssSelector("li.menu_Hotels"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.menu_Hotels")));
		
		Actions act = new Actions(driver);
		
		act.contextClick(element).build().perform();
		
//		
//		 JavascriptExecutor executor = (JavascriptExecutor) driver;
//		    executor.executeScript("arguments[0].click()", element);
		
//		element.sendKeys(Keys.RIGHT);
//		element.sendKeys(Keys.ENTER);
		
		
//		
		
	}

}
