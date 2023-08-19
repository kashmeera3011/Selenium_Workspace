package module_$;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiselectDropdownEx 
{
	public static WebDriver driver ;

    @BeforeTest
    public void startbrowser () throws Exception
    {
        System.out.println("launching browser");
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

    }

    @Test

    public void selectlist () throws Exception {

        WebElement ele1 = driver.findElement(By.id("multi-select"));
        Select se= new Select(ele1);
        se.selectByValue("New Jersey");
        Thread.sleep(2000);
        se.selectByValue("Texas");
        Thread.sleep(2000);
        se.selectByValue("Florida");
        Thread.sleep(2000);
        //Thread.sleep(10000);
        WebElement btn1= driver.findElement(By.id("printMe"));
        btn1.click(); // it is supposed to return New Jersy 
        WebElement firstOption = se.getFirstSelectedOption();
        System.out.println("The First selected option is::" +firstOption.getText());
        List <WebElement> oSize = se.getAllSelectedOptions();

        int iListSize = oSize.size();
        // Setting up the loop to print all the options
        for (int i = 0; i < iListSize; i++)
        {
            // Storing the value of the option  
            String sValue = oSize.get(i).getText();
            // Printing the stored value
            System.out.println(sValue);
        }
    }
}

