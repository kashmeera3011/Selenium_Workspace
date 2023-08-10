package Module3;

public class AverageValueofArray 
{
	
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50}; // Replace this with your own array of elements

	        double average = calculateAverage(array);

	        System.out.println("The average value of the array elements is: " + average);
	    }

	    public static double calculateAverage(int[] array) {
	        if (array.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty.");
	        }

	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }

	        return (double) sum / array.length;
	    }
	}


