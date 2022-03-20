package Web.Web;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		WebElement label = driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5' and text()='From']"));
		try {
		js.executeScript("arguments[0].click();",label);
		System.out.println("clecked");
		}
		catch (Exception e){
			
			System.out.println("not clicked");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		WebElement textbox =  driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		textbox.sendKeys("mumbai");
		}
		catch(Exception e){			
        e.printStackTrace();
		}
	}
	
}
