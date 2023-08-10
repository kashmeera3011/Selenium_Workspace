import java.util.Scanner;

public class DemonstrateTryCatchBlock 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int result = 10 / num;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero or invalid input.");
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("This block will always execute.");
        }

        scanner.close();
    }
}
