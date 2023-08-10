package Module3;

public class Pattern4 
{
	        
	
	    public static void printPattern(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int numRows = 3;
	        printPattern(numRows);
	    }
}

	


