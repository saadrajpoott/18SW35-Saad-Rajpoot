class Parent
{
	final public void displayText()
	{
		System.out.println("Hello People you cannot override this method cuz its final");
	} 
}

class Child extends Person
{
	public void displayText()
	{
		System.out.println("Hello People you cannot override this method cuz its final");	
	}
}

public class ThirdTask
{

}