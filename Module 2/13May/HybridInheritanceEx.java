package task_13_May;

class P
{
	void p()
	{
		System.out.println("P excecuted");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q excecuted");
	}
}
interface R 
{
	void r();
	
}
class S extends Q implements R
{
	void s()
	{
		System.out.println("S excecuted");
	}
	
	@Override
	public
	
	void r()
	{
		System.out.println("R Executed");
	}
}
public class HybridInheritanceEx 
{
	public static void main(String[] args) {
		
		S s1 = new S();
		s1.p();
		s1.q();
		s1.r();
		s1.s();
	}
}
