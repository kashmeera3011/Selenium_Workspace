package task_16_May;

import javax.xml.validation.Validator;

public class throwEx 
{
	
	static void validate(int age )
	{
		if(age<18)
		{
			throw new  ArithmeticException("Age is not valid");
		}
		else
		{
			System.out.println("Eligible for vote");
		}
	}
	public static void main(String[] args) 
	{
		validate(19);
		
	}
}
