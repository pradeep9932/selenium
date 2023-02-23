package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");

	
	//by clasname
		
	int n =  driver.findElements(By.className("preload")).size();
	System.out.println(n);

	//by tagname
	
	int links =  driver.findElements(By.tagName("link")).size();
	System.out.println(links);
	

	

}}
