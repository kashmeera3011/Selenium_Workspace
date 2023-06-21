package task_21_june;

import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitParameterEx 
{
	static Addition a1=null;
	int fno,sno,eno;
	
	public JunitParameterEx(int fno,int sno,int eno) 
	{
		
		
		// TODO Auto-generated constructor stub
		
		this.eno =eno;
		this.fno = fno;
		this.sno = sno;
		
	}
	
	@BeforeMethod
	public void before()
	{
		a1 = new Addition();
	}
	
	@Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[] [] {{1,2,3} , {5,6,12}});
		
	}
	
	@Test
	public void test()
	{
		System.out.println("Your expected value is " +eno);
		assertEquals(eno, a1.sum(fno, sno));
	}
	
	@After
	public void after()
	{
		System.out.println("closed");
	}
}
