package tasks;
class Parent
{
	final public void displayText()
	{
		System.out.println("Hello People you cannot override this method cuz its final");
	} 
}

class Child extends Parent
{
	public void displayText()
	{
		System.out.println("Hello People you cannot override this method cuz its final");	
	}
}