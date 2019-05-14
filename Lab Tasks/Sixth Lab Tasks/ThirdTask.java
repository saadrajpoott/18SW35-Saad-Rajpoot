public class ThirdTask{

	public static void main(String[] args)
	{
		ThirdTask obj1 = new ThirdTask();

		obj1.charPrinter(20, '=');

		System.out.print("\n\n");
		
		obj1.charPrinter('=', 20);

	}

	void charPrinter( int num, char ch )
	{
		for( int x=0; x<num; x++ )
		{
			System.out.print(ch + " ");
		}
	}

	void charPrinter( char ch, int num )
	{
		for( int x=0; x<num; x++ )
		{
			System.out.print(ch + " ");
		}
	}
}
