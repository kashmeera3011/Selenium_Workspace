package task_26june;

import org.testng.annotations.Test;

public class GroupDemo
{
	@Test(groups = {"red"})
  	public void red1() 
	{
		System.out.println("This is REd 1...");
	}
	@Test(groups = {"red"})
  	public void red2() 
	{
		System.out.println("This is REd 2...");
	}
	@Test(groups = {"red"})
  	public void red3() 
	{
		System.out.println("This is REd 3...");
	}
	@Test(groups = {"green"})
  	public void green1() 
	{
		System.out.println("This is Green 1...");
	}
	@Test(groups = {"green"})
  	public void green2() 
	{
		System.out.println("This is Green 2...");
		
	}
	@Test(groups = {"green"})
  	public void green3() 
	{
		System.out.println("This is Green 3...");
	}
	
	@Test(groups = {"red","green"})
  	public void red_green() 
	{
		System.out.println("This is Red_Green ...");
	}
}
