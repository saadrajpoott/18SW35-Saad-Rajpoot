class Sports
{
	public String getName()
	{
		return "Generic Sports";
	}

	public void getNumberOfTeamMembers()
	{
		System.out.println("Each Team has n players in " + getName());
	}
}

class Cricket extends Sports
{
	public String getName()
	{
		return "Cricket";
	}

	public void getNumberOfTeamMembers()
	{
		System.out.println("Each Team has 11 players in " + getName());
	}

}

class Soccer extends Sports
{
	public String getName()
	{
		return "Soccer";
	}

	public void getNumberOfTeamMembers()
	{
		System.out.println("Each Team has 11 players in " + getName());
	}
}

public class SecondTask
{
	public static void main(String[] args)
	{
		
	}
}