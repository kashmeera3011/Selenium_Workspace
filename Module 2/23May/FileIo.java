package task_23_may;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo
{
	public static void main(String[] args) throws IOException
	{
		String s1 = "Welcome to India";
		FileOutputStream fos = new FileOutputStream("G://kashu.txt");
		fos.write(s1.getBytes());
		System.out.println("Success");
		
	}
}
