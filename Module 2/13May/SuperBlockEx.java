package task_13_May;

class Color
{
	String color = "Red";
}
class Color1 extends Color
{
	String color = "Black";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperBlockEx {

	
	
	public static void main(String[] args) 
	{
		Color1 c = new Color1();
		c.display();
	}
}
