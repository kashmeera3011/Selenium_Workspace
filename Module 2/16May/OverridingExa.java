package task_16_May;

class BankRate
{
	int rate()
	{
		return 0;
	}
}
class Idfc extends BankRate
{
	int rate()
	{
		return 6;
	}
}
class Sbi extends BankRate
{
	int rate()
	{
		return 7;
	}
}
class Union extends BankRate
{
	int rate()
	{
		return 8;
	}
}
public class OverridingExa 
{
	public static void main(String[] args) 
	{
		BankRate  b1;
		b1 = new Idfc();
		System.out.println(b1.rate());
		b1 = new Sbi();
		System.out.println(b1.rate());
		b1 = new Union();
		System.out.println(b1.rate());
	}
}
