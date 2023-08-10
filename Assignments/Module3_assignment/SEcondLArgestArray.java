
public class SEcondLArgestArray
{
	public static void main(String[] args) 
	{
        int[] array = { 5, 10, 2, 15, 8 };

        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize with the smallest possible value

        for (int num : array) 
        {
            if (num > largest)
            {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) 
            {
                secondLargest = num;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) 
        {
            System.out.println("The second largest element is: " + secondLargest);
        } 
        else 
        {
            System.out.println("There is no second largest element.");
        }
    }
}
