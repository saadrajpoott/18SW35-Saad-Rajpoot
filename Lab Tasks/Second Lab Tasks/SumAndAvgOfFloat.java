public class SumAndAvgOfFloat{
	
	public static void main(String args[])
	{
		double[] arrayOfFloat = {45.12, 5.28, 21.01, 22.54, 80.62};
		double average = 0;
		double sum = 0;

		for(int x = 0; x<arrayOfFloat.length; x++)
		{
			sum += arrayOfFloat[x];
		} 

		average = sum / arrayOfFloat.length;

		System.out.println("Array:");
		for( int x=0; x<arrayOfFloat.length; x++)
		{
			System.out.print(arrayOfFloat[x] + " ");
		}

		System.out.println("\nSum: " + sum);
		System.out.println("Average: " + average);
	}
}