package task_13_May;

class A
{
	void a ()
	{
		System.out.println("A accessed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B accessed");
	}
}

public class SingleInheritanceex {

	public static void main(String[] args) {
		
		B b1 = new B();
		b1.a();
		b1.b();
		
	}
	
}
