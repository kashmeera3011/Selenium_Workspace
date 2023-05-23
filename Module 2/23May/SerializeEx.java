package task_23_may;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) throws IOException
	{
		SerializableExStudent s1 = new SerializableExStudent(101, "kashu");
		FileOutputStream fout = new FileOutputStream("G://mihir.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
	}
}
