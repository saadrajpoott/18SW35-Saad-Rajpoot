import java.util.*;

public class TableGenerator{

	public static void main(String args[])
	{
		Scanner inputObject = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = inputObject.nextInt();

		System.out.print("Enter Starting Point: ");
		int startingPoint = inputObject.nextInt();

		System.out.print("Enter Ending Point: ");
		int endingPoint = inputObject.nextInt();

		for( int start = startingPoint; start<=endingPoint; start++ )
		{
			System.out.println(number + " x " + start + " = " + (number * start) );
		}		

	}
}