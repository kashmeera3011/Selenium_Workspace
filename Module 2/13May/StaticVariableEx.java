package task_13_May;

public class StaticVariableEx {

	static int count = 0;
	
	StaticVariableEx()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		StaticVariableEx sv1 = new StaticVariableEx();
		StaticVariableEx sv2 = new StaticVariableEx();
		
		
	}
}
