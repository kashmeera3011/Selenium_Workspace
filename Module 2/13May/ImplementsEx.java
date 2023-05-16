package task_13_May;

interface Print
{
	void print();
}
interface Show
{
	void show();
}


public class ImplementsEx implements Print,Show
{
	public static void main(String[] args) 
	{
		
		ImplementsEx ie = new ImplementsEx();
		ie.print();
		ie.show();
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("Showing");
		
	}

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("Printing");
		
	}
	
	
}
