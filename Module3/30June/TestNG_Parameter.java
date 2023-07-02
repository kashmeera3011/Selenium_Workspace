package task_30_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter
{
	WebDriver driver ;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	}
	
	@Test
	@Parameters({"email","password"})
	public void login(String email, String password) throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		if (driver.getCurrentUrl().equals("https://www.saucedemo.com/")) 
		{
			System.out.println("Test is Failed..");
		} 
		else 
		{
			System.out.println("Test is Passed");
		}
	}
	@Test
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
}
