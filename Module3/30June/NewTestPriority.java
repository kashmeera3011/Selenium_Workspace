package task_30_june;

import org.testng.annotations.Test;

public class NewTestPriority
{
	@Test(priority = 4)
	public void test1()
	{
		System.out.println("Running test1..........");
	}
	@Test (priority = 1,expectedExceptions = ArithmeticException.class)
	public void login()
	{
		int i= 10/0;
		
		System.out.println("Login test");
	}
	@Test (priority = 2,enabled = false)
	public void alpha()
	{
		System.out.println("Running alpha test...");
	}
	@Test (priority = 3)
	public void home()
	{
		System.out.println("Running home test ...");
	}
}
