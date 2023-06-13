package task_10_june;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import task_3_june.DriverConnection;

public class DragAndDropEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = DriverConnection.getconnection("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/a[1]"));
		
		WebElement to = driver.findElement(By.id("trash"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(from, to).build().perform();
		
		/*
		 * Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
		 * 
		 * dd.perform();
		 */
		Thread.sleep(5000);
		driver.quit();
	}
}

