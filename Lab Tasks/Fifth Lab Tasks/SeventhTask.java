import java.util.Scanner;
public class SeventhTask{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String  firstMember = input.nextLine();
		String  secondMember = input.nextLine();

		String[] firstArray = firstMember.split(", ");
		String[] secondArray = firstMember.split(", ");

		System.out.println("STUDENT 1");
		System.out.println( "Name: " + firstArray[0]);
		System.out.println( "Age: " + firstArray[1]);
		System.out.println( "Program: " + firstArray[2]);

		System.out.println("STUDENT 2");
		System.out.println( "Name: " + secondArray[0]);
		System.out.println( "Age: " + secondArray[1]);
		System.out.println( "Program: " + secondArray[2]);
	}
}