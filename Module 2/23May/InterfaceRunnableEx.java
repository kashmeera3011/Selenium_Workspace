package task_23_may;

class C1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<=10; i++)
		{
			System.out.println("Thread A :" + i);
			
		}
	}
	
}
class D1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<=10; i++)
		{
			System.out.println("Thread B :" + i);
			
		}
	}
	
}
public class InterfaceRunnableEx
{
	public static void main(String[] args) 
	{
		A1 a = new A1();
		B1 b = new B1();
		a.run();
		b.run();
	}
}
