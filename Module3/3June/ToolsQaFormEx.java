package task_3_june;

import java.sql.Driver;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolsQaFormEx
{
	public static void main(String[] args) throws InterruptedException 
	{
		String day = "27";
		String month = "March";
		String year = "2000";
		
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("firstName")).sendKeys("Kashmeera");
		Thread.sleep(1000);
		
		driver.findElement(By.id("lastName")).sendKeys("bhut");
		Thread.sleep(1000);
		
		driver.findElement(By.id("userEmail")).sendKeys("kashu@yopmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("userNumber")).sendKeys("9898985656");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d :days)
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

