package task_14_june;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith (Parameterized.class)
public class LoginParameterex 
{
	String username;
	String password;
	
	public LoginParameterex(String username,String password) 
	{
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}
	
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = DriverConnectionex.getconnection("https://www.demoblaze.com/");
		
	}
		
		@Test 
		public void aopenpage()
		{
			 driver.findElement(By.linkText("Log in")).click();
			 
			 
		}
		
		@Test
		public void logintest() throws InterruptedException
		{
			WebElement uname = driver.findElement(By.id("loginusername"));
			uname.clear();
			uname.sendKeys(username);
			
			Thread.sleep(2000);
			
			WebElement pass =  driver.findElement(By.id("loginpassword"));
			pass.clear();
			pass.sendKeys(password);
			
			
			Thread.sleep(2000);
			
		}
		
		@Parameters
		public static List<Object[]> getdata()
		{
			Object obj[][] = new Object[4][2];
			
			obj[0][0] ="kashu@yopmail.com";
			obj[0][1]= "12345";
			
			obj[1][0] ="ashu@yopmail.com";
			obj[1][1]= "12345434";
			
			obj[2][0] ="fashu@yopmail.com";
			obj[2][1]= "12345434";
			
			obj[3][0] ="mashu@yopmail.com";
			obj[3][1]= "12345434";
			
			return Arrays.asList(obj);
			
			
			
		}
		
		/*
		 * @AfterClass
		 * 
		 * public void quit() { driver.quit(); }
		 */

	}
	
