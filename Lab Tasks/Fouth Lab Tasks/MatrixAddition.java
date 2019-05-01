public class MatrixAddition{
	
	public static void main(String args[])
	{
		final int row= 3;
		final int column = 3; 
		int[][] arrayA = {{1, 2, 3 }, {0, 5, 6}, {7, 8, 9}};
		int[][] arrayB = {{0, 0, 3 }, {4, 8, 6}, {2, 6, 0}};
		int[][] arrayC = new int[row][column];



		// Displays Array A
		System.out.println("\nArray A");
		for( int r=0; r<row; r++ )
		{
			for( int c=0; c<column; c++ )
			{	
				System.out.print(arrayA[r][c] + " ");
			}

			System.out.println();
		}

		// Displays Array B
		System.out.println("\nArray B");
		for( int r=0; r<row; r++ )
		{
			for( int c=0; c<column; c++ )
			{	
				System.out.print(arrayB[r][c] + " ");
			}

			System.out.println();
		}

		// Calculates Array A + Array B
		for( int r=0; r<row; r++ )
		{
			for( int c=0; c<column; c++ )
			{	
				arrayC[r][c] = arrayA[r][c] + arrayB[r][c];
			}
		}


		// Displays Array C=A+B
		System.out.println("\nArray C");
		for( int r=0; r<row; r++ )
		{
			for( int c=0; c<column; c++ )
			{	
				System.out.print(arrayC[r][c] + " ");
			}

			System.out.println();
		}

		System.out.println("\n");
		for( int r=0; r<row; r++ )
		{
			for( int c=0; c<column; c++ )
			{	
				System.out.print( "C" + r + c + "= " + arrayC[r][c] + " \n");
			}
		}
	}

}

	









