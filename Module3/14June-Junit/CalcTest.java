package task_14_june;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest
{
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		
		int actual = c.add(10,20);
		
		
		int expected = 30;
		
		assertEquals(expected, actual);
		
	}
}
