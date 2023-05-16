package task_13_May;

public class ErrorHandlingEx {
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Program Start");
			int  i =10/0;
			System.out.println(i);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program End");
	}

}
