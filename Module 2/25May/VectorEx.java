package task_25_May;

import java.util.Vector;

public class VectorEx
{
	public static void main(String[] args) {
		Vector  v = new Vector<>(5);
		
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("a");
		v.add("a");
		v.add("a");
		
		System.out.println("size: " + v.size());
		System.out.println("capicity: " + v.capacity());
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		if(v.contains("a"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
	}
}
