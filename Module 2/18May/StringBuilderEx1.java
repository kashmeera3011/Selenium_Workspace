package task_18_May;

public class StringBuilderEx1
{
	public static void main(String[] args) {
		
		String s = "kashu";
		String s1 = "TOPS";
		String s2 = " abcd ";
		String s3 = "php is a programming language .php is a open source ";
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.trim());
		System.out.println(s3.replace("php", "java"));
		System.out.println(s2.charAt(0));
	}
}
