package module_4_Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTestNg
{
	private WebDriver driver;

    
	@BeforeMethod
    public void setUp() 
	{
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testFacebookLogin() {
        // Open Facebook login page
        driver.get("https://www.facebook.com/");

        // Enter username and password
        driver.findElement(By.id("email")).sendKeys("your_email@example.com");
        driver.findElement(By.id("pass")).sendKeys("your_password");

        // Click the login button
        driver.findElement(By.id("loginbutton")).click();

        // Verify successful login by checking for a specific element on the home page
        boolean loggedIn = driver.findElements(By.id("userNavigationLabel")).size() > 0;
        AssertJUnit.assertTrue(loggedIn);
    }

   
	@AfterMethod
    public void tearDown()
	{
        // Close the browser
        driver.quit();
    }
}
