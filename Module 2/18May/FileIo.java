package task_18_May;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo 
{
	public static void main(String[] args) throws IOException 
	{
		String s = "Welcomw to HOme";
		FileOutputStream fos = new FileOutputStream("FUNNY (G:)://mihir.txt");
		fos.write(s.getBytes());
		System.out.println("Success");
	}
}
