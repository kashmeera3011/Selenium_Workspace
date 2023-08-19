package module_4_Testng;

import org.testng.annotations.Test;

public class TestNgGroupExample
{
	@Test(groups = "sanity")
    public void testMethod1() 
	{
        System.out.println("Test method 1");
    }

    @Test(groups = "sanity")
    public void testMethod2() 
    {
        System.out.println("Test method 2");
    }

    @Test(groups = "regression")
    public void testMethod3() 
    {
        System.out.println("Test method 3");
    }

    @Test(groups = "regression")
    public void testMethod4()
    {
        System.out.println("Test method 4");
    }
}
