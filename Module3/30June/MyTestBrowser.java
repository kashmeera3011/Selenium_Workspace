package task_30_june;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestBrowser
{
	
	WebDriver driver = null;
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		
		
		if (browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://topsint.com/topserp/index.php");
		
	}
	
	
	
}
