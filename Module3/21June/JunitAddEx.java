package task_21_june;

import org.junit.Test;

public class JunitAddEx 
{
	int  a = 5,b=6,c=5;
	
	@Test
	public void test()
	{
		AddExJunit ae = new AddExJunit();
		System.out.println(ae.add(a, b));
	}
}
