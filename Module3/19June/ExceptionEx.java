package task_19_june;

import org.junit.Test;

public class ExceptionEx 
{
	@Test
	public void test()
	{
		int i = 2;
		int j = 10/i;
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test1()
	{
		int a [] = new int [5];
		a[6] = 10 ;
	}
}
