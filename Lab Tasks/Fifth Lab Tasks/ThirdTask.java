public class ThirdTask{
	
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		dog1.setDetails("Billu", "German Shepherd", 4);
		dog1.showDetails();

	}
}

class Dog{

	String name;
	String breed;;
	int age;

	Dog()
	{
		name = "not specified";
		breed =  "not specified";
		age = 0;
	}

	void setDetails( String n, String b, int a )		// n for name
	{													// b for breed
		thname = n;										// a for age
		breed = b;
		age = a;										
	}

	void showDetails()
	{
		if( name != " " && breed != " " && age != 0)
		{
			System.out.println("Name: " + name + "\nBreed: " + breed + "\nAge: " + age + " years." );
		}
		else
		{
			System.out.println("Details are unavailable.");
		}
	}


}