import java.util.*;

class Marksheet{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------MARKSHEET PROGRAM------");
		
		System.out.println("Subject A marks: ");
		int subjectA = sc.nextInt();
		
		System.out.println("Subject B: marks: ");
		int subjectB = sc.nextInt();
		
		System.out.println("Subject C: marks: ");
		int subjectC = sc.nextInt();
		
		int obtMarks = subjectA + subjectB + subjectC;
		float percentage = ((float)obtMarks/300)*100;

		System.out.println("Total Marks: 300");
		System.out.println("Obtained Marks: " + obtMarks );
		System.out.println("Percentage: " + percentage );
		if( percentage >= 90 )
		{
			System.out.println("Grade: A");
		}
		else if( percentage >= 80 )
		{
			System.out.println("Grade: B");
		}
		else if( percentage >= 70 )
		{
			System.out.println("Grade: C");
		}
		else if( percentage >= 60 )
		{
			System.out.println("Grade: D");
		}
	}

} 