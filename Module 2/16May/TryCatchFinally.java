package task_16_May;

public class TryCatchFinally 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Program Started");
			int i = 10/0;
			System.out.println(i);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program Ended");
		}
	}
}
