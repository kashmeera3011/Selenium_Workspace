import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
        int[] array = { 1, 2, 3, 4, 5 };

        // Reversing the array
        int length = array.length;
        for (int i = 0; i < length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        System.out.println("Original Array: " + Arrays.toString(array));
    }
}
