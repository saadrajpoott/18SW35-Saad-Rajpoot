public class FourthTask{

	public static void main(String[] args) {
			
		FourthTask geometricalShapes = new FourthTask();

		int areaOfSquare = geometricalShapes.printArea(2);
		System.out.println("Area Of Square: " + areaOfSquare);

		int areaOfRectangle = geometricalShapes.printArea( 2, 8 );
		System.out.println("Area Of Rectangle: " + areaOfRectangle);
	}

	int printArea( int side )
	{
		return side * side;
	}

	int printArea(int length, int width)
	{
		return length * width; 
	}
}