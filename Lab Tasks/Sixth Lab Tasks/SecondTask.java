import java.util.Scanner;
public class SecondTask{

	public static void main(String[] args )
	{
		Author author1 = new Author("Saad", "saad@gmail.com", 'm');
		Author author2 = new Author("John", "john@gmail.com", 'm');
		Author author3 = new Author("Kate", "katewinslet@gmail.com", 'f');
		Author author4 = new Author("Sana", "sana@yahoo.com", 'f');
   		
		Author[] firstBookAuthors = {author1, author3};
		Author[] secondBookAuthors = {author2, author4};
		Author[] thirdBookAuthors = {author3, author2};

   		Book book1 = new Book("Learn Programming Today", firstBookAuthors, 850.0 );
   		Book book2 = new Book("Become A Hacker", secondBookAuthors, 980.4 );
   		Book book3 = new Book("Science in Computer", thirdBookAuthors, 400.0 );

   		// System.out.println(book1.getAuthors()[0].name);

   		System.out.print(book1.toString());

	}
}

class Book{

	Scanner input = new Scanner(System.in);
	private String name;
	private Author[] author;
	private double price;
	private int quantity;

	Book( String name, Author[] author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}		

	Book( String name, Author[] author, double price, int quantity )
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName()
	{
		return name;
	}

	public Author[] getAuthors()
	{
		return author;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice()
	{
		System.out.print("Set Price: ");
		this.price = input.nextDouble();
	}

	public int getQty()
	{
		return quantity;
	}

	public void setQty()
	{
		System.out.print("Enter Quantity: ");
		this.quantity = input.nextInt();
	}

	public String toString()
	{
		return "Book [ name = " + name + ", authors ={ Author[name=" + author[0].getName() + " email=" + author[0].getEmail() + ", gender=" + author[0].getGender() +
				"], Author[ name=" + author[1].getName() + " email= " + author[1].getEmail() + " gender" +author[1].getGender() + "]";
	}
}







