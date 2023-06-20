package task_19_june;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationDemo 
{
	@Test
	public void alpha()
	{
		System.out.println("Alpha");
	}
	
	@Test
	public void beta()
	{
		System.out.println("BETA");
	}
	
	@Before
	public void before()
	{
		System.out.println("2");
	}
	
	@Test
	public void gama()
	{
		System.out.println("gama");
	}
	
	@After
	public void after()
	{
		System.out.println("3");
	}
	@BeforeClass
	public static void Beforeclass()
	{
		System.out.println("1");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("4");
	}
	
}
