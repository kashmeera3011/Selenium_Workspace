import java.util.ArrayList;

public class RemoveThirdElement
{
	 public static void main(String[] args)
	 {
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        arrayList.add(10);
	        arrayList.add(20);
	        arrayList.add(30);
	        arrayList.add(40);
	        arrayList.add(50);

	        int indexToRemove = 2; // Index of the third element (0-based index)

	        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) 
	        {
	            arrayList.remove(indexToRemove);
	            System.out.println("Updated ArrayList: " + arrayList);
	        } 
	        else
	        {
	            System.out.println("Invalid index to remove.");
	        }
	    }
}
