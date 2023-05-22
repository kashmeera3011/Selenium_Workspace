package task_18_May;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeEx 
{
	public static void main(String[] args) throws IOException
	{
		SerializeEx s1 = new SerializeEx();
		FileOutputStream fout = new FileOutputStream("FUNNY (G:)://mihir.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
	}
}
