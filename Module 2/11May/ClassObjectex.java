package task_11_May;

public class ClassObjectex {
	
	int id;
	String name;
	
	public static void main(String[] args) {
		
	
	
		ClassObjectex  s1 = new ClassObjectex () ;
		
		s1.id = 100 ;
		s1.name = "Kashu";
		
		ClassObjectex s2 = new ClassObjectex();
		
		s2.id = 200;
		s2.name = "kishu";
		
		ClassObjectex s3 = new ClassObjectex();
		
		s3.id= 300;
		s3.name = "kashmeera" ;
		
		System.out.println(s1.id+ " "+s1.name);
		System.out.println(s2.id+ " " +s2.name);
		System.out.println(s3.id + " " +s3.name);
		
		
		
	}
}
