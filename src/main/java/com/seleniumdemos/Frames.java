package com.seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
           
		
//		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://javadoc.io/doc/io.rest-assured/rest-assured/latest/index.html");
//		driver.manage().window().maximize();
		
		System.setProperty("webdriver.chrome.driver", "Resource\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javadoc.io/doc/io.rest-assured/rest-assured/latest/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		
		List<WebElement> fs = driver.findElements(By.tagName("iframe"));
		System.out.println(fs.size());
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
	
		driver.switchTo().frame(iframe);
		
//		driver.switchTo().frame(iframe);
//		Thread.sleep(5000);
//		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
//		driver.findElement(By.xpath("//a[contains(text(),'io.restassured')]")).click();
//		Thread.sleep(5000);
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
//		driver.findElement(By.xpath("//a[contains(text(),'RestAssured')]")).click();
		
		List<WebElement> frameset = driver.findElements(By.xpath("//frameset/frameset/frame"));
		System.out.println(frameset.size());
		for(WebElement w:frameset){
				//System.out.println(w.getAttribute("name"));
				if(w.getAttribute("name").equalsIgnoreCase("packageListFrame")){
					Thread.sleep(5000);
					driver.switchTo().frame("packageListFrame");
					driver.findElement(By.xpath("//a[contains(text(),'io.restassured')]")).click();
		
//					if(w.getAttribute("name").equals("packageFrame")) {
//						Thread.sleep(5000);
//						driver.switchTo().frame("packageFrame");
//						driver.findElement(By.xpath("//a[contains(text(),'RestAssured')]")).click();		
//					}
					Thread.sleep(6000);
					driver.switchTo().defaultContent();
				}
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	
		
		driver.switchTo().frame(iframe);		
		List<WebElement> framesett = driver.findElements(By.xpath("//frameset/frameset/frame"));
		System.out.println(framesett.size());
		for(WebElement w1:framesett){
			Thread.sleep(5000);
				if (w1.getAttribute("name").equalsIgnoreCase("packageFrame")){
				Thread.sleep(5000);
				driver.switchTo().frame("packageFrame");
				//driver.findElement(By.xpath("//a[contains(text(),'Argument')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'RestAssured')]")).click();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				Thread.sleep(5000);
				driver.navigate().back();
			}
			  driver.switchTo().defaultContent();
		}
		driver.navigate().back();
		System.out.println(driver.getTitle());
	 }
	    
  }
}
