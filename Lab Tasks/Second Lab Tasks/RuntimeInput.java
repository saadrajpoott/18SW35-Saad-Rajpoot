import java.util.Scanner;
public class RuntimeInput{

	public static void main(String blabla[])
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your Roll No: ");
		int rollNo = input.nextInt();

		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
	}
}