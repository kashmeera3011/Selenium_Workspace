package module_4_Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginTest 
{
	private WebDriver driver;

    @BeforeMethod
	public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGmailLogin() 
    {
        // Open Gmail login page
        driver.get("https://mail.google.com/");

        // Enter username and password
        driver.findElement(By.id("identifierId")).sendKeys("your_email@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        // Wait for password input field to appear
        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        driver.findElement(By.name("password")).sendKeys("your_password");
        driver.findElement(By.id("passwordNext")).click();

        // Verify successful login by checking for a specific element on the Gmail page
        boolean loggedIn = driver.findElements(By.partialLinkText("Compose")).size() > 0;
        AssertJUnit.assertTrue("Login was not successful", loggedIn);
    }

    @AfterMethod
	public void tearDown() 
    {
        // Close the browser
        driver.quit();
    }
}
