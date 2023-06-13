package task_12_june;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task_3_june.DriverConnection;

public class WebTableEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/webtables");
		
		driver.manage().window().maximize();
		
		String name= "Alden";
		Thread.sleep(1000);
		
		
		try
		{
			
			WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			if(element.isDisplayed())
			{
				//driver.findElement((("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
				
				driver.findElement(By.xpath("//*[text()='"+ name +"']/following-sibling::div[6]/div/span[1]")).click();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Not Available");
		}
	}
}
