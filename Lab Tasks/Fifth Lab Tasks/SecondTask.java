import java.util.Scanner;
public class SecondTask{

	public static void main(String[] args)
	{
		MyClass obj1 = new MyClass();

		obj1.populateArray();
		obj1.displayArray();
		obj1.evenOddCalculator();
	}
}


class MyClass{

	MyClass()
	{
		// Empty Constructor
	}

	Scanner i = new Scanner(System.in);
	int[] intArray = new int[10];
	int even = 0, odd = 0;

	void populateArray()
	{
		for( int x=0; x<intArray.length; x++ )
		{	
			System.out.print("Enter Integer: ");
			intArray[x] = i.nextInt();
		}
	}

	void displayArray()
	{	
		for(int x=0; x<intArray.length; x++) 
		{
			System.out.print( intArray[x] + " ");	
		}
	}

	void evenOddCalculator()
	{
		for( int x=0; x<intArray.length; x++ )
		{
			if( intArray[x] % 2 == 0  )
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		System.out.println("\nEven Numbers: " + even + "\n" + "Odd Numbers: " + odd);
	} 

}