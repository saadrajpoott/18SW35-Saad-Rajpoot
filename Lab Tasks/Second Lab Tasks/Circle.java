import java.util.Scanner;
public class Circle{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		final double PI = 3.1415;
		System.out.print("Enter radius of the Circle in meters: ");
		double radius = input.nextDouble();

		double circumference = 2*PI*radius;
		double diameter = 2*radius;
		double area = PI * radius*radius;

		System.out.println("Area of Circle: " + area);
		System.out.println("Diameter of Circle: " + diameter);
		System.out.println("Circumference of Circle: " + circumference);
	}
}