package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorclas3 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		//dr.manage().window().maximize();
		
		//css selector
		//tag&id
		driver.findElement(By.cssSelector("#email")).sendKeys("t-sheart");
		driver.findElement(By.cssSelector("#passContainer.")).sendKeys("t-sheart");
		driver.click();

		//tag&clas
		driver.findElement(By.cssSelector(".class")).sendKeys("t-sheart");
		driver.findElement(By.cssSelector(".class")).click();

		//tag&attribute
		
		driver.findElement(By.cssSelector("tag[]")).sendKeys("t-sheart");
		driver.findElement(By.cssSelector("tag[]")).click();

		//tag clas & attribute
		
		driver.findElement(By.cssSelector("tag.clas[]")).sendKeys("t-sheart");
		driver.findElement(By.cssSelector("tag.clas[]")).click();

	}

}
