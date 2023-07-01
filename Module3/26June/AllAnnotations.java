package task_26june;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AllAnnotations 
{
	@BeforeSuite
	public void Beforesuit()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Before test");
	}
	@AfterTest
	public void Aftertest()
	{
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("After Method");
	}
	@Test
	public void test()
	{
		System.out.println("This is a main test");
	}
	
	//@Ignore
	@Test
	public void testKAs()
	{
		System.out.println("This is a kashu test");
	}
}

