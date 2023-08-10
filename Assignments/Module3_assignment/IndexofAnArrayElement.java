package Module3;
import java.util.Scanner;

public class IndexofAnArrayElement 
{
	

	
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50}; // Replace this with your own array of elements
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the element to find its index: ");
	        int elementToFind = scanner.nextInt();

	        int index = findElementIndex(array, elementToFind);

	        if (index != -1) {
	            System.out.println("The element " + elementToFind + " is found at index: " + index);
	        } else {
	            System.out.println("The element " + elementToFind + " is not found in the array.");
	        }
	    }

	    public static int findElementIndex(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;
	            }
	        }
	        return -1; // Element not found in the array
	    }
	}


