
public class LargestNumberInArray{
	
	public static void main(String args[])
	{
		int[] intArray = {402, 100, 78, 0, 12, 900, 8, 9, 0, 55};
		int largeNumber = intArray[0];
		for( int i=0; i<intArray.length; i++  )
		{
			if( intArray[i] > largeNumber )
			{
				largeNumber = intArray[i];
			}
		}

		System.out.println("Largest Number in Array is: " + largeNumber);
	}

}
