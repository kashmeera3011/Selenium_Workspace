package Module3;

public class AverageValueOfSumEx 
{
	public static void main(String[] args)
	{
		int arr[] =  {1,2,3,4,5};
		
		int sum = 0 ;
		for(int i = 0; i<=arr.length;i++)
		{
			sum =sum + arr.length;
			Double average = (double) (sum/arr.length);
			System.out.println(average);
		}
	}
}
// ask to hetal 