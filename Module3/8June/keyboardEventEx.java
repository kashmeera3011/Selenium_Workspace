package task_8_june;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import task_3_june.DriverConnection;

public class keyboardEventEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnection("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		Actions builder = new Actions(driver);
		
		builder.click(search).keyDown(Keys.SHIFT);
		
		Thread.sleep(1000);
		
		builder.click(search).sendKeys("tops technologies")
			.keyUp(Keys.SHIFT)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
		
	}
}
