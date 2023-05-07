package automation1;

public class SumOfFiveSubject {

	public static void main(String[] args) {
		
		float eng, phy, chem, math, comp; 
	     double total, average, percentage;
	    
	    /* Input marks of all five subjects */
	  
	    
	   
	    eng= 100;
	
	    phy= 70;
	   
	    chem= 89;
	   
	    math= 92;
	  
	    comp= 98;

	    /* Calculate total, average and percentage */
	    total = eng + phy + chem + math + comp;
	    average = (total / 5.0);
	    percentage = (total / 500.0) * 100;

	    /* Print all results */
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);

		
		
	}
}
