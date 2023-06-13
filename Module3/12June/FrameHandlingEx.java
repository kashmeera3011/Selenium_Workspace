package task_12_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task_3_june.DriverConnection;

public class FrameHandlingEx
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		WebElement myframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(myframe);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(text);
	}
}
