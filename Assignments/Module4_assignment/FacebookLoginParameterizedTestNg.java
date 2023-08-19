package module_4_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginParameterizedTestNg
{
	private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"email1@example.com", "password1"},
            {"email2@example.com", "password2"},
            // Add more test data here
        };
    }

    @Test(dataProvider = "loginData")
    public void testFacebookLogin(String email, String password) {
        // Open Facebook login page
        driver.get("https://www.facebook.com/");

        // Enter username and password
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        // Click the login button
        driver.findElement(By.id("loginbutton")).click();

        // Verify successful login by checking for a specific element on the home page
        boolean loggedIn = driver.findElements(By.id("userNavigationLabel")).size() > 0;
        Assert.assertTrue(loggedIn, "Login was not successful for email: " + email);
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
