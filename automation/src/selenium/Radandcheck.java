package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radandcheck
{
	
public static void main(String[] args)


{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://demo.guru99.com/test/radio.html");
	
	driver.manage().window().maximize();
	
	
	//to select specific checkbox
	//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
	
	//to select all the checkboxes
	{
	int checkbox = driver.findElement(By.xpath("//input[@id='vfb-6-0'] and//input[contains(@value,'checkbox')]"));
   System.out.println("total no of checkboxes:" +checkbox.Size());
   
   for(int i=0; i<=checkbox.Size(); i++)
   checkbox.get(i).click();
}*/
	//to select multiple checkboxes by choice

}




}

