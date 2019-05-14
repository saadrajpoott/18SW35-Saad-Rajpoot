public class SixthTask{

	public static void main(String[] args) {
		
		Car car1 = new Car("Lamborghini Aventador", 4500000, "Black");		
		Car car2 = new Car("Bently Bentayga", 500000, "Yellow");
		Car car3 = new Car("Bugatti Chiron", 8500000, "Red");

		car1.getInfo();
		car2.getInfo();
		car3.getInfo();

	} 

}


class Car{

	String name;
	double price;
	String color;
	static int numberOfCars;

	Car()
	{
		this.name = "Not Specified";
		this.price = 0;
		this.color = "Not Specified";
		this.numberOfCars++;
	}

	Car( String name, double price, String color )
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.numberOfCars++; 
	}

	void setPrice(double price)
	{
		this.price = price;
	}

	void setColor(String color)
	{
		this.color = color;
	}

	void getInfo()
	{
		System.out.println("Name: " + name + "\nColor: " + color + "\nPrice($): " + price + "\nNumber Of Cars Created: " + numberOfCars + "\n\n");
	}
}