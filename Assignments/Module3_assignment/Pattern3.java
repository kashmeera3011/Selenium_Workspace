package Module3;

public class Pattern3
{
	
	    public static void printPattern(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print((i + j) % 2);
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int numRows = 5;
	        printPattern(numRows);
	    }
}


