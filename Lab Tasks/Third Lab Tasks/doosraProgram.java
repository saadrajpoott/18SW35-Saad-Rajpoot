import java.util.*;

class doosraProgram{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units Consumed: ");
		int units = sc.nextInt();
		int amount=0;
		if( units <= 50 )
		{
			amount = units * 10;
			System.out.println("Total Bill: " + amount);
		}
		else if( units <= 100 )
		{
			int temp = units - 50;
			amount = (temp*15) + 500;
			System.out.println("Total Bill: " + amount);
		}
		else if(units <= 200)
		{
			int temp = units - 100;
			amount = (temp * 20) + 1250;
			System.out.println("Total Bill: " + amount);
		}
		else if( units <= 300 )
		{
			int temp = units - 200;
			amount = (temp*25) + 3250;
			System.out.println("Total Bill: " + amount);
		}
	}
}