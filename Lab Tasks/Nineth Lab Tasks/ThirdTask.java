class NegativeException extends Exception
{
	public NegativeException()
	{
		super("n or p should not be negative");
	}
}

class ZeroException extends Exception
{
	public ZeroException()
	{
		super("n or p should not be zero");
	}
}

class MyCalculator
{
	public long power( int n, int p )
	{
		int temp=1;
		try
		{	if( n<0 || p<0 )
			{ 
				throw new NegativeException();
			}
			else
			if( n==0 || p==0 )
			{
				throw new ZeroException();
			}
			else
			{
				for( int x=0; x<p; x++ )
				{
					temp *= n;
				}
				return temp;
			}	
		}
		catch( NegativeException ne )
		{
			System.out.println("Exception: " + ne.getMessage());
			return -1;
		}
		catch( ZeroException ze )
		{
			System.out.println("Exception: " + ze.getMessage());
			return -1;
		}
	}
}

public class ThirdTask
{
	public static void main(String[] args)
	{
		MyCalculator obj1 = new MyCalculator();
		System.out.println(obj1.power(1,-8));	
	}
}