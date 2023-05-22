package task_18_May;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FUNNY (G:)://mihir.txt"));
		ObjectInputStream in = null;
		StringEX s1 = (StringEX) in.readObject();
		System.out.println(s1.id+" "+s1.name);
		
	}
}
