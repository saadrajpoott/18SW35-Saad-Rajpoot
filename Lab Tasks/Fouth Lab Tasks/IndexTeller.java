import java.util.Scanner;
public class IndexTeller{

	public static void main(String args[])	
	{
		Scanner input = new Scanner(System.in);

		int[] integersArray = new int[100];
		// integersArray[0] = 25;
		for( int x=0; x<integersArray.length; x++ )
		{
			integersArray[x] = (int)(Math.random() * 100 );
		}

		for( int x=0; x<integersArray.length; x++ )
		{
			 System.out.println(integersArray[x]);
		}

		System.out.println("We have an Array of Integers."); 
		System.out.print("Enter a number to check if it is in the Array or not: ");
		int number = input.nextInt();		

		for( int x=0; x<integersArray.length; x++ )
		{
			if(integersArray[x] == number  )
			{
				System.out.println("Yes," + number + " is a part of Array.");
				break;
			}			
		}
		System.out.println("Number not found in array.");
	} 
}