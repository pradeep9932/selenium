package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//absolute xpath
/*		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input ")).sendKeys("phusdb");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input ")).click();
*/
		//relative xpath
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pnndnd");
		driver.findElement(By.xpath("//*[@id=\"pass\"] ")).sendKeys("bjgg");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
	
	}

}
