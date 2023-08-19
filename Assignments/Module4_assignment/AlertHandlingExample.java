package module_$;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingExample
{
	public static void main(String[] args) 
	{	
		WebDriver driver = null;
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
         driver = new ChromeDriver();

        // Open the webpage
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        // Locate the "Delete Customer" button and click it
        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept (click OK) the alert
        alert.accept();

        // Handle any subsequent actions after the alert is dismissed
        // For example, you might want to verify that the deletion was successful.

        // Close the browser
        driver.quit();
    }
}
