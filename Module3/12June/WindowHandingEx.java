package task_12_june;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task_3_june.DriverConnection;

public class WindowHandingEx
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnection("http://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWin = driver.getWindowHandles();
		
		for(String win : allWin)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
				
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("kesu@yopmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
