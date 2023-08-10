import java.util.Scanner;

public class MultipleCatchBlocks 
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
            System.out.println("Error: Division by zero.");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid number format.");
        } 
        catch (Exception e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
	}
}
