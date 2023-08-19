package module_$;


import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertExample
{
	@Test
    public void testAssertEquals() 
	{
        int expected = 5;
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAssertNotEquals()
    {
        int expected = 5;
        int actual = 10;
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testAssertTrue() 
    {
        boolean condition = true;
        Assert.assertTrue(condition);
    }

    @Test
    public void testAssertFalse() 
    {
        boolean condition = false;
        Assert.assertFalse(condition);
    }

    @Test
    public void testAssertNull() 
    {
        Object obj = null;
        Assert.assertNull(obj);
    }

    @Test
    public void testAssertNotNull() 
    {
        Object obj = new Object();
        Assert.assertNotNull(obj);
    }

    @Test
    public void testAssertArrayEquals() 
    {
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        //Assert.assertArrayEqals(expectedArray, actualArray);
        Assert.assertEquals(expectedArray, actualArray);
    }

}
