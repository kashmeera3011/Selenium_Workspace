package task_28june;


import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNgParameter 
{
	WebDriver driver=null;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"email", "password"})
	public void login(String email,String password) throws InterruptedException
	{
		//System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("user-name")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		//System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/"))
		{
			System.out.println("Test Failed");
			
		}
		else
		{
			System.out.println("This test is passed..");
		}
	}
	
	
	@Test
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
	
}
