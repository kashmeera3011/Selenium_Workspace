package module_$;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;



public class GmailRegister 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = null ;
		 driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/createaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstName")).sendKeys("shmiraben");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("bhut");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).sendKeys("30");
		Thread.sleep(2000);
		
		
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select months = new Select(month);
		
		months.selectByVisibleText("November");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("year")).sendKeys("1993");
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.id("gender"));
		
		Select genders = new Select(gender);
		
		genders.selectByVisibleText("Female");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("selectionc1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("hello@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("PasswdAgain")).sendKeys("hello@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("selectionc3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("9106754699");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"code\"]")).sendKeys("805706");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		
	}
}
