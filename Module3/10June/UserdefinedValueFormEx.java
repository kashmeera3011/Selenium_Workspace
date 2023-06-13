package task_10_june;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import task_3_june.DriverConnection;
import task_3_june.S014_screenshot;

public class UserdefinedValueFormEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String day = "27";
		String month = "March";
		String year = "2000";
		
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/automation-practice-form");

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter firstname");
		
		String name =sc.next();
		
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("firstName")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("k@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("9999999999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));

		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		

		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				
			}
		}
		
		WebElement subject =  driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		
		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("Rajkot");
		
		S014_screenshot.getScreenShot(driver, "reg");
	}
}
