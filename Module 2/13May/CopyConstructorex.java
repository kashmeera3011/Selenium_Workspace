package task_13_May;

public class CopyConstructorex {

	int id ;
	String name;
	String surname;
	
	public CopyConstructorex(int i, String n,String s) 
	{
	
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
		surname = s ;
	}
	
	public CopyConstructorex(CopyConstructorex cce) 
	{
		// TODO Auto-generated constructor stub
		System.out.println(cce.id+ " " +cce.name+ " " +cce.surname );
	}
	
	void display()
	{
		System.out.println(id+" " +name+ " " +surname );
	}
	public static void main(String[] args)
	{
		CopyConstructorex c1 = new CopyConstructorex(1, "Kashu", "Patel");
		CopyConstructorex c2 = new CopyConstructorex(2, "bashu", "Patel");
		c1.display();
		c2.display();
	}

}
