package task_13_May;

public class StaticMathodEx 
{
	int id ;
	String name;
	static String College = "ABCD";
	
	public StaticMathodEx( int i,String  n)
	{
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	static void change ()
	{
		College = "VVP";
	}
	void display()
	{
		System.out.println(id + " " +name + " " +College );
	}
	public static void main(String[] args) {
		
		change();
		StaticMathodEx sm = new StaticMathodEx(1, "A");
		StaticMathodEx sm1 = new StaticMathodEx(2,"B" );
		sm.display();
		sm1.display();
	}
}
