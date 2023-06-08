package task_6_june;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import task_3_june.DriverConnection;

public class AlertHandlingEx
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConnection.getconnection("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(5000);
		alert2.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Typing..");
		Thread.sleep(5000);
		alert3.accept();
		
	}
}
