
abstract class Parent 
{
	   abstract void message();
}

	// First subclass
	class FirstSubclass extends Parent {
	    @Override
	    void message() {
	        System.out.println("This is first subclass");
	    }
	}

	// Second subclass
	class SecondSubclass extends Parent {
	    @Override
	    void message() {
	        System.out.println("This is second subclass");
	    }
	}

	public class AbstractClassExample 
	{
	    public static void main(String[] args) 
	    {
	        Parent first = new FirstSubclass();
	        Parent second = new SecondSubclass();

	        first.message();  // This will print: "This is first subclass"
	        second.message(); // This will print: "This is second subclass"
	    }
	}

