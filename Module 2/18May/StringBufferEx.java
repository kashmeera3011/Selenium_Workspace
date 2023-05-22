package task_18_May;

import javax.sound.sampled.ReverbType;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello Kashu");
		//sb.append(" Java");
		
				//System.out.println(s1);
				System.out.println(sb.insert(1, "Java"));
				//System.out.println(sb.delete(1, 3));
				//System.out.println(sb.replace(1, 3, "Java"));
		
		System.out.println(sb.reverse());
	}
}
