package task_25_May;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList arraylist = new ArrayList<>();
		arraylist.add("Android");
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add(1);
		
		ArrayList<String>arrayList2 = new ArrayList<>();
		
		arrayList2.add("A");
		arrayList2.add("B");
		arrayList2.add("C");
		arrayList2.add("Php");
		
		 // arraylist.addAll(arrayList2); 
		  //arrayList.remove(1);
		  //arrayList.removeAll(arrayList2);
		 
		
		arraylist.retainAll(arrayList2);
		
		Iterator i = arraylist.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		

		
	}

	
}
