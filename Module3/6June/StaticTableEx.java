package task_6_june;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task_3_june.DriverConnection;

public class StaticTableEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConnection.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		Thread.sleep(1000);
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
											
		
		for(int i =1; i <=header.size();i++)
		{
			 String data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th["+i+"]")).getText();
			 System.out.print(data + "");
			 
		}
		Thread.sleep(1000);
		System.out.println();
		Thread.sleep(1000);
		List<WebElement>  rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				String data =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+ "");
			}
			Thread.sleep(1000);
			System.out.println();
		}
		driver.quit();
	}
	
}
