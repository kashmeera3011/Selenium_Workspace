package Module3;

public class pattern2 
{
	
	    public static void printPattern(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int numRows = 5;
	        printPattern(numRows);
	    }
	}


