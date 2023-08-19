package module_4_Testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

import static org.testng.ConversionUtils.wrapDataProvider;

import java.util.Arrays;
import java.util.Collection;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@RunWith(Parameters.class)
public class FacebookLoginDataProvider 
{
	@Factory
	public static Object[] factoryData() {
		return wrapDataProvider(FacebookLoginDataProvider.class, data());
	}

	@Parameters
    public static Collection<Object[]> data() 
	{
        return Arrays.asList(new Object[][] 
        {
            {"email1@example.com", "password1"},
            {"email2@example.com", "password2"},
            // Add more test data here
        });
    }

    private final String email;
    private final String password;

    public FacebookLoginDataProvider(String email, String password) 
    {
        this.email = email;
        this.password = password;
    }

    @Test
    public void testFacebookLogin() 
    {
    	WebDriver driver =null;
         driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com/");

        // Enter username and password
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        // Click the login button
        driver.findElement(By.id("loginbutton")).click();

        // Verify successful login by checking for a specific element on the home page
        boolean loggedIn = driver.findElements(By.id("userNavigationLabel")).size() > 0;
        AssertJUnit.assertTrue("Login was not successful for email: " + email, loggedIn);

        // Close the browser
        driver.quit();
    }
}
