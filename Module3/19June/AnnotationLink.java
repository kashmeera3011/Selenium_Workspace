package task_19_june;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import task_14_june.DriverConnectionex;

public class AnnotationLink 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass()
	{
		
		
		driver = DriverConnectionex.getconnection();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void test1()
	{
		assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Kashu@yopmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		Thread.sleep(2000);
	}
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
}
