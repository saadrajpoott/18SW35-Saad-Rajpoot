package tasks;
interface AdvancedArithmatic
{
	public int sumOfFactors( int n );
}

class MyCalculator implements AdvancedArithmatic
{
	
	public int sumOfFactors( int n )
	{
		int sum =1;
		for( int x=2; x<=n; x++)
		{
			if( n%x ==0 )
			{
				sum+=x;
			}
		}

		return sum;
	}
}

public class FirstTask
{
	public static void main(String[] args)
	{
		MyCalculator m1 = new MyCalculator();
		System.out.println("Sum of factors: " + m1.sumOfFactors(6));
	}
}