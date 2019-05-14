import java.util.Scanner;
public class UseOfScanner{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Taking Integer Input 
		System.out.print("\nEnter an Integer: ");
		int integerInput = input.nextInt();
		System.out.println("\nInteger: " + integerInput);

		// Taking Long Input
		System.out.print("\nEnter a Long: ");
		long longInput = input.nextLong();
		System.out.println("\nLong: " + longInput);

		// Taking Double Input
		System.out.print("\nEnter a Double: ");
		double doubleInput = input.nextDouble();
		System.out.println("\nDouble: " + doubleInput);

		// Taking Character Input
		System.out.print("Enter a Character: ");
		char charInput = input.next().charAt(0);
		System.out.println("\nCharacter: " + charInput );

		// Taking String Input
		System.out.print("\nEnter a String: ");
		String stringInput = input.nextLine();
		System.out.println("\nString: " + stringInput);
	}
}