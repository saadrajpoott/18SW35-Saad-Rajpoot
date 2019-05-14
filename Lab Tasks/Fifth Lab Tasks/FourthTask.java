import java.util.Scanner;
public class FourthTask{

	public static void main(String[] args)
	{
		
	}
}

class Student{

	Scanner input = new Scanner(System.in);

	String name;
	int rollNo;
	int age;
	
	
	Student()
	{ 
		name = "not specified";
		rollNo = 0;
		age = 0;
		
	}

	Student( String name, int rollNo, int age )
	{	
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	void setData()
	{
		System.out.print("Enter Name: ");
		name = input.nextLine();

		System.out.print("\nEnter Roll No: ");
		rollNo = input.nextInt();

		System.out.print("\nEnter Age(in years): ");
		age = input.nextInt();
	}

	void displayData()
	{
		System.out.print("\nName: " + name);
		System.out.print("\nRoll No: " + rollNo);
		System.out.print("\nAge: " + age + "years");
	}

}