package task_6_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import task_3_june.DriverConnection;

public class DynamicTableEx 
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverConnection.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String text = driver.findElement(By.xpath("//table[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr[3]/td[1]")).getText();
		System.out.println(text);
	}
}
