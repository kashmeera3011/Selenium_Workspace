package task_8_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import task_3_june.DriverConnection;

public class MouseEventEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnection.getconnection("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		
		Thread.sleep(1000);
		
		WebElement Mobile = driver.findElement(By.linkText("Mobiles"));
		
		Thread.sleep(1000);
		
		WebElement bestseller = driver.findElement(By.linkText("Best Sellers"));
		
		Thread.sleep(1000);
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(sell).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(bestseller).build().perform();
		Thread.sleep(1000);
		
		builder.moveToElement(Mobile).build().perform();
		Thread.sleep(1000);
		
		
		
	}
}
