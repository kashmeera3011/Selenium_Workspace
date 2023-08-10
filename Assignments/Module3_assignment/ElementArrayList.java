import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList
{
	public static void main(String[] args) 
	{
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Using a for-each loop
        System.out.println("Using for-each loop:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Using an iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
