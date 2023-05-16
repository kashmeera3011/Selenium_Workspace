package task_16_May;

import java.io.IOException;

class P1
{
	void p1() throws IOException
	{
		System.out.println("P excecuted");
	}
}
class Q1 extends P1
{
	void q1() throws IOException 
	{
		System.out.println("Q Excecuted");
		P1 p = new P1();
		p.p1();
	}
}
class R1 extends Q1
{
	void r1() throws IOException
	{
		System.out.println("R Excecuted");
	}
}
public class ThrowsEx 
{
	public static void main(String[] args) throws IOException {
		
		R1 r = new R1();
		r.p1();
		r.q1();
		r.r1();
		
	}
}
