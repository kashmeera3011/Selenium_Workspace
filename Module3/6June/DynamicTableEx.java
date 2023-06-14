package task_6_june;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import task_3_june.DriverConnection;

public class DynamicTableEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr[2]/td[1]/span")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		
	}
}
