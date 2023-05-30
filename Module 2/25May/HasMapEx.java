package task_25_May;

import java.util.HashMap;
import java.util.Map;

public class HasMapEx
{
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("A", 101);
		hmap.put("B", 102);
		hmap.put("c", 103);
		
		System.out.println(hmap.get("A"));
		
		for(Map.Entry map1 : hmap.entrySet())
		{
			System.out.println(map1.getKey()+" " +map1.getValue());
		}
		
	}
}
