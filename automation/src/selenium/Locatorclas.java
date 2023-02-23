package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locatorclas 
{
	

	public static void main(String[] args)

	
	
	{

		// Selenium Locators - Part 1 | ID, Name, Link Text, Partial Link Test, Tag Name, Class & CSS Selector

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		//dr.manage().window().maximize();
		
		//by id
	WebElement a =driver.findElement(By.id("email"));
		a.sendKeys("preeep");
	
		
		// by name
		WebElement b = driver.findElement(By.name("pass"));
		b.sendKeys("amda");

		
		 //by linktext
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
		//by prtiallinktext
			driver.findElement(By.partialLinkText("Forgotten")).click();
	
		
		
		
		}

}
