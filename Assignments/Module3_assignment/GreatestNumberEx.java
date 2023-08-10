package Module3;

import java.util.Scanner;

public class GreatestNumberEx
{
	public static void main(String[] args)
	{
		int a,b,c,largest; 	
		
		Scanner s = new Scanner(System.in);
		
		 System.out.println("enter first number");
		 a = s.nextInt();
		 
		System.out.println("enter Second Number");
		b= s.nextInt();
		
		System.out.println("enter Third Number");
		c= s.nextInt();
		
		if(a>=b)
		{
			System.out.println("The Largest Number is"  + a);
		}
		else if (b>=c)
		{
			System.out.println("The Largest Number is"  + b);
		}
		else
		{
			System.out.println("The Largest Number is"  + c);
		}
		
		
	}
}
