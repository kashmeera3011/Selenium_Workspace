package task_23_may;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("G://mihir.txt"));
		SerializableExStudent st = (SerializableExStudent) in.readObject();
		System.out.println(st.id+" "+st.name);
		
	}
}
