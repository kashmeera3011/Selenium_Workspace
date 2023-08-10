

import java.util.Scanner;

public class AverageValueOfSumEx 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Enter value " + i + ": ");
            int value = scanner.nextInt();
            sum += value;
        }

        double average = (double) sum / n;

        System.out.println("Sum of values: " + sum);
        System.out.println("Average of sum: " + average);

        scanner.close();
	}
}
// ask to hetal 