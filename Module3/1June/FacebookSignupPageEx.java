package task_1_june;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupPageEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Kashmeera");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("kashu@yopmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kashu@yopmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));

		Select days = new Select(day);
		
		days.selectByVisibleText("30");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select months = new Select(month);
		
		months.selectByVisibleText("Nov");
		
		Thread.sleep(2000);
		
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select years = new Select(year);
		
		years.selectByVisibleText("1993");
		
		
		Thread.sleep(2000);
		
		List<WebElement> l = driver.findElements(By.name("sex"));
		
		l.get(0).click();
		
		driver.findElement(By.name("websubmit"));
		
		
		
		
		
		
		
		
	}
}
