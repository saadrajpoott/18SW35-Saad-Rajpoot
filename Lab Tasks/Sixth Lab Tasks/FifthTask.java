import java.util.Scanner;
public class FifthTask{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		Student[] studentsArray = new Student[10];

		// Creats 10 objects
		for( int x=0; x<studentsArray.length; x++ )
		{	
			studentsArray[x] = new Student();
		}

		studentsArray[0].setInfo("Student1", 19, "North Street, House 101, Boston");
		studentsArray[1].setInfo("Student2", 16, "South Street, House 110, Latifabad");
		studentsArray[2].setInfo("Student3", 18, "Shahfaisal Colony, House 18, Saddar Hyd");
		studentsArray[3].setInfo("Student4", 28, "Almustafa Town, House 101, NewYork");
		studentsArray[4].setInfo("Student5", 25, "Arif Builders, House 1001, Saint louis Misuri");
		studentsArray[5].setInfo("Student6", 19, "Near Cathedral Church, House 101, West Hampton");
		studentsArray[6].setInfo("Student7", 20, "Paretabad, House 430, Sharjah");
		studentsArray[7].setInfo("Student8", 22, "North Street, House 101, Brunei");
		studentsArray[8].setInfo("Student9", 23, "Silicon Valley, House 207, America");
		studentsArray[9].setInfo("Student10", 21, "Main Street, House 1, Boston");

		System.out.println("\n\n");

		for( int x=0; x<studentsArray.length; x++ )
		{
			studentsArray[x].getInfo();
			System.out.println("\n");
		}
	}

}

class Student{

	String name;
	int age;
	String address;

	Student()
	{
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}

	void setInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void setInfo(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	void getInfo()
	{
		System.out.print("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
	}
}