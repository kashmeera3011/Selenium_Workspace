package task_18_May;

public class StringEX 
{
	public static void main(String[] args) 
	{
		String s1= "sachin"; //literal string
		
		String s2 = "sachin";
		
		String s3 = new String("Sachin"); //object string
		
		char ch[] = {'s','a','c','h','i','n'}; //character array string

		String s4 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

	public String id;
	public String name;
}
