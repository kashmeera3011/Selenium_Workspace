package task_16_May;


public class OverLoadingEx 
{
	static int add (int a ,int b)
	{
		return a+b;
	}
	static double add (double a ,double b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		System.out.println(add(5,2));
		System.out.println(add(5.00,2.00));
	}

	
	
}
