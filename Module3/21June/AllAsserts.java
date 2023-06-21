package task_21_june;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllAsserts
{
	@Test
	public void test()
	{
		int a= 5,b=6,c=5;
		int a1[] = {1,2,3};
		int b1 [] = {1,2,3};
		String s1= null, s2 = "Tops";
		
		//assertEquals(a,b);
		//assertNotEquals(a,b);
		//assertSame(a,b);
		//assertSame(a,c);
		//assertNotSame(a, b);
		//assertTrue(a>b);
		//assertTrue(a<b);
		//assertFalse(a>b);
	
		assertArrayEquals(a1, b1);
		
		
	}
}
