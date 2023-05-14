package task_13_May;

import java.util.jar.Attributes.Name;

public class ParameterizedConstructor 
{
	
	int id;
	String name;
	String surname;
	
	public ParameterizedConstructor(int id,String name, String surname)
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.surname = surname;
		
	}
	void display()
	{
		
		System.out.println(id+ " " +name + " " +surname);
	}
	public static void main(String[] args) {
		
		ParameterizedConstructor pc1 = new ParameterizedConstructor(101, "Isha", "Ambani");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(102, "Anil", "Ambani");
		pc1.display();
		pc2.display();
	}
}
