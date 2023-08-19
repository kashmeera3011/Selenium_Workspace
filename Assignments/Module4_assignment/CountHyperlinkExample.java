package module_$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlinkExample
{
	public static void main(String[] args) 
	{	
		WebDriver driver =null;
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
         driver = new ChromeDriver();

        // Open the webpage
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        // Find all hyperlinks on the page using the "a" tag
        java.util.List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        // Print the total number of hyperlinks
        System.out.println("Total Hyperlinks: " + hyperlinks.size());

        // Close the browser
        driver.quit();
    }
}
