package task_1_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kashu@yopmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginbutton"));
		Thread.sleep(2000);
		
		driver.close();
	}
}
