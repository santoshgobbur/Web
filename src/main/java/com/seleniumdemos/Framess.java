package com.seleniumdemos;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Framess {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "Resource\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javadoc.io/doc/io.rest-assured/rest-assured/latest/index.html");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		
		driver.switchTo().frame(iframe);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> pckframeListFrame = driver.findElements(By.xpath("//frame[@name='packageListFrame']"));
	
		for(WebElement frame:pckframeListFrame){
	
			if(frame.getAttribute("name").equals("packageListFrame")){
				driver.switchTo().frame("packageListFrame");
				driver.findElement(By.xpath("//a[contains(text(),'io.restassured')]")).click();
				System.out.println("Clicked");	
			}	
		}
		
	//	WebDriverWait w = new WebDriverWait(driver,30);
		
//		w.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//iframe[@name='classFrame']"))));
//		driver.switchTo().frame(iframe);
		
//		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement elee = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//iframe[@name='classFrame']"))));
		
		//WebElement ele = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		
		driver.switchTo().frame(elee);
		
		List<WebElement> pckframe = driver.findElements(By.xpath("//frame[@name='packageFrame']"));
		
		for(WebElement frame:pckframe){
			
			if(frame.getAttribute("name").equals("packageFrame")){
				driver.switchTo().frame("packageFrame");
				driver.findElement(By.xpath("//a[contains(text(),'RestAssured')]")).click();
				System.out.println("Clicked");	
			}
		}
		
      
	}

}
