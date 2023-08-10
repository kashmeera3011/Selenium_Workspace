import java.util.Scanner;

public class GradeCalculator 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();
        scanner.close();

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);
    }

    public static String calculateGrade(int marks)
    {
        if (marks >= 91 && marks <= 100) 
        {
            return "AA";
        } 
        else if (marks >= 81 && marks <= 90) 
        {
            return "AB";
        } 
        else if (marks >= 71 && marks <= 80) 
        {
            return "BB";
        } 
        else if (marks >= 61 && marks <= 70) 
        {
            return "BC";
        } 
        else if (marks >= 51 && marks <= 60)
        {
            return "CD";
        } 
        else if (marks >= 41 && marks <= 50) 
        {
            return "DD";
        } 
        else 
        {
            return "Fail";
        }
    }
}
