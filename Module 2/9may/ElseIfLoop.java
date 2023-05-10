package task_9_May;

public class ElseIfLoop {

	public static void main(String[] args) {
		

		float eng, phy, chem, math, comp; 
	     double total, average, percentage;
	     
	     	eng= 35;
	 	
		    phy= 30;
		   
		    chem= 30;
		   
		    math= 30;
		  
		    comp= 30;
		    
		    total = eng + phy + chem + math + comp;
		    average = (total / 5.0);
		    percentage = (total / 500.0) * 100;
	     
	     if(percentage > 75)
	     {
	    	 System.out.println("Distinction");
	     }
	     else if (percentage > 60)
	     {
	    	 System.out.println("First Class");
	     }
	     else if (percentage > 50)
	     {
	    	 System.out.println("Second Class");
	     }
	     else if (percentage > 35)
	     {
	    	 System.out.println("Pass Class");
	     }
	     else
	     {
	    	 System.out.println("Fail");
	     }
	}
}
