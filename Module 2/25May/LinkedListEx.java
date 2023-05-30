package task_25_May;

import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.addFirst("E");
		list.addLast("F");
		System.out.println(list);
	}
}
