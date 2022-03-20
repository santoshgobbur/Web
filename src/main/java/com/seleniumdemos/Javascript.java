package com.seleniumdemos;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resource\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javadoc.io/doc/io.rest-assured/rest-assured/latest/index.html");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		
		driver.switchTo().frame(iframe);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='packageListFrame']")));
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='io.restassured.filter.cookie']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// click
        js.executeScript("arguments[0].click();",ele);
        
       // scroll vertically 
        js.executeScript("window.scrollBy(0,600)");
         
       // driver.switchTo().parentFrame();
         
         driver.switchTo().defaultContent();
         System.out.println(driver.getTitle());
         
         //Navigate to different page
         js.executeScript("window.location = 'https://www.google.com/'");
         
         // To get the URL of a webpage
         String sText =  js.executeScript("return document.URL;").toString();
          
         // To get the title of a webpage
         String ssText =  js.executeScript("return document.title;").toString();
         
         // To get innertext of the entire webpage
         String sssText =js.executeScript("return document.documentElement.innerText;").toString();
         
         // To refresh browser window
         js.executeScript("history.go(0)");
         
         // To Type Text in a Text Box
         js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
         System.out.println("clicked");
         
	}

}
