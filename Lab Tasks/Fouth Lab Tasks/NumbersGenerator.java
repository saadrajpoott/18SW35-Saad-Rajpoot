import java.util.*;


public class NumbersGenerator{

	public static void main(String args[])
	{
		Scanner inputObject = new Scanner(System.in);
		System.out.print("Enter n: ");
		int nthTerm = inputObject.nextInt();
		long sumOfNumbers = 0;


		for( int x=1; x<=nthTerm; x++)
		{
			sumOfNumbers += x;
		}

		System.out.println("Sum Of n Numbers is: " + sumOfNumbers);
	}

}