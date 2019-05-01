import javax.swing.JOptionPane;
import java.util.*;

public class PyramidProgram{


	public static void main(String args[])
	{
		// Qustion 1: Part (i)
		// for( short x=0; x<10; x++)
		// {
		// 	for( short y=0; y<x; y++)
		// 	{
		// 		System.out.print("*");
		// 	}

		// 	System.out.println();
		// }

		// Question 1: Part (ii)
		// for( short i=10; i>0; i--)
		// {
		// 	for( short j=i; j>0; j-- )
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// Question 1: Part (iii)
		for( int x=1; x<=5; x++ )
		{
			for( int y=x; y<=5; y++ )
			{
				System.out.print(" ");
			}

			for( int z=1; z<=x; z++ )
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}