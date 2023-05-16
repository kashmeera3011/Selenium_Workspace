package task_13_May;

final class Secret
{
	void s()
	{
		System.out.println("Secrets");
	}
}
class Kashu
{
	void p()
	{
		System.out.println("Under Animal Category");
	}
}
class Bhavin extends Kashu
{
	void q()
	{
		System.out.println("Birds Category");
	}
}
class Kiaan extends Bhavin
{
	void r()
	{
		System.out.println("Insects Category");
	}
}
	public class MultilevelInheritanceEx 
	{
		
		public static void main(String[] args)
		{
			
			Kiaan k = new Kiaan();
			k.p();
			k.q();
			k.r();
			//k.s();
		}
	
	}

