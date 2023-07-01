package task_26june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider
{
	WebDriver driver = null ;
	@DataProvider(name = "Kashu")
	public Object[] [] input()
	{
		return new Object [][] {{"pranav","1234"},{"rahul.san@gmail.com","rah345"}};
		
	}
	
	@Test(dataProvider = "Kashu")
	public void login(String email,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginusername")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("STORE"))
		{
			System.out.println("This is passed");
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Log out")).click();
			Thread.sleep(2000);
		}
		
	}
}
