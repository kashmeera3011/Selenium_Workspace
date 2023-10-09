package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clicktocart 
{
	public static void clicktocart() throws InterruptedException 
	{
		
		
		WebElement Mycart = DriverConnection.driver.findElement(By.linkText("Cart"));
		 Thread.sleep(1000);
		 
		 Actions builder = new Actions(DriverConnection.driver);
		 builder.moveToElement(Mycart).build().perform(); Thread.sleep(1000);
		 
		
		DriverConnection.driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("name")).sendKeys("KAshmira");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("city")).sendKeys("rangilu");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("card")).sendKeys("42424242424242");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("month")).sendKeys("02");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("year")).sendKeys("2026");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
		
	}
	
	public static void getScreenShot(WebDriver driver, String imgname)
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\img\\"+imgname+".png");

		try 
		{
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
