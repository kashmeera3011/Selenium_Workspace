import java.util.Arrays;

public class CopyArray 
{
	public static void main(String[] args) 
	{
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length]; // Create a new array with the same length

        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) 
        {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));
    }
}
