package task_1_june;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefoxEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
