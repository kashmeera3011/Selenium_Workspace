package task_30_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class home_work_multiuser_login 
{
	
	WebDriver driver;
	
	@BeforeTest
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 0)
	@Parameters({"email","password"})
	public void login(String email, String password) throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		System.out.println("Logged in successfully");
	}
	
	@Test (priority = 1)
	public void AddtoCart() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("first-name")).sendKeys("kashu");
		Thread.sleep(2000);
		
		driver.findElement(By.id("last-name")).sendKeys("Patel");
		Thread.sleep(2000);
		
		driver.findElement(By.id("postal-code")).sendKeys("360005");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		
	}
}
