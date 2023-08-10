import java.util.Arrays;

public class UpdateArrayElement
{
	public static void main(String[] args) 
	{
        int[] array = { 1, 2, 3, 4, 5 };
        int indexToUpdate = 2; // Index of the element to update
        int newValue = 10;     // New value to replace the existing value

        if (indexToUpdate >= 0 && indexToUpdate < array.length) 
        {
            array[indexToUpdate] = newValue;
            System.out.println("Updated array: " + Arrays.toString(array));
        } 
        else
        {
            System.out.println("Invalid index to update.");
        }
    }
}
