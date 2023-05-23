package task_23_may;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListEx
{
	public static void main(String[] args)
	{
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("a");
		arraylist.add("b");
		arraylist.add("c");
		
		ArrayList<String> arraylist1 = new ArrayList<>();
		arraylist1.add("d");
		arraylist1.add("e");
		arraylist1.add("c");
		arraylist1.add("f");
		
		arraylist.retainAll(arraylist1);
		
		//fetch value
		
		Iterator<String> i = arraylist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
