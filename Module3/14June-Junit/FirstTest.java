package task_14_june;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest 
{
	@Test
	public void test()
	{
		//assertEquals(10, 10);//true
		//assertNotEquals(10,20);
		//assertNull(null);
		//assertNotNull(10);
		assertTrue(10>20);
	}
	
	@Test
	public void test2()
	{
		System.out.println("Running program");
	}
}
