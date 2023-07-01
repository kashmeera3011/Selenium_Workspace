package task_28june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgDependence 
{
WebDriver driver=null;
	
	@Test
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = {"beforetest"})
	public void login() throws InterruptedException
	{
		//System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		//System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/"))
		{
			System.out.println("Test Failed");
			//fail();
		}
		else
		{
			System.out.println("This test is passed..");
		}
	}
	
	@Test(dependsOnMethods = {"login"})
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = {"signout"})
	public void aftertest()
	{
		driver.close();
	}
	
	
	
	
}
