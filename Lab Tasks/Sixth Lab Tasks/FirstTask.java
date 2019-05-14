import java.util.Scanner;
public class FirstTask{

	public static void main(String[] args)
	{

		Author author1 = new Author("Saad Rajpoot", "saadrajpoot922@gmail.com", 'm');
		Author author2 = new Author("Shahzaib Panhwar", "panhwarshahzaib34@gmail.com", 'm');
		Author author3 = new Author("Aasiya Almani", "aasiyaalmani2@gmail.com", 'f');

		System.out.print(author1.toString());

	}
} 

class Author{

	Scanner input = new Scanner(System.in);
	private String name;
	private String email;
	private char gender;


	Author( String name, String email, char gender )
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public void setEmail()
	{	
		System.out.print("\nEnter email: ");
		this.email = input.nextLine();
	}

	public String getEmail()
	{
		return email;
	}

	public String getName()
	{
		return name;
	} 

	public char getGender()
	{
		return gender;
	}

	public String toString()
	{
		return "Author[ Name = " + name + ", Email = " + email + ", Gender = " + gender + "]";
	}
}















