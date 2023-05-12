package task_11_May;

import java.util.Scanner;

public class LogicalExa {
	public static void main(String[] args) {
		
		int eng;
		int math; 
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter english marks");
		eng = s.nextInt();
		
		System.out.println("enter Maths marks");
		math = s.nextInt();
		
		if((eng >= 65 && math >=65))
		{
			System.out.println("A grade");
		}
		else if ((eng >= 65 || math <=40))
		{
			System.out.println("Good in english but not in maths");
		}
		else if ((eng <=40 || math >=65))
		{
			System.out.println("Good in maths but not in English");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
