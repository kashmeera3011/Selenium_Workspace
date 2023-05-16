package task_13_May;

class Bank
{
	void bank()
	{
		System.out.println("Bank acceses");
	}
}
class Current extends Bank
{	
	void current()
	{
		System.out.println("Current accessed");
	}
}
class Save extends Current
{
	void save()
	{
		System.out.println("Save accessed");
	}
	
}
public class HierarchicalEx
{
	public static void main(String[] args)
	{
		Current c = new Current();
		Save s1 = new Save();
		c.current();
		
		s1.save();
		
		s1.bank();
	}
}
