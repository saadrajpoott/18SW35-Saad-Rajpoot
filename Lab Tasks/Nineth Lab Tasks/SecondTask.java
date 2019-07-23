class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		super("Invalid Age Exception");	
	}
}

class VotingMachine 
{
	String[] names = new String[5];

	public void addCandidates( String[] names )
	{
		this.names = names;
	}

	int[] votes = new int[5];

	public void castVote( int age, String votesToCandidate ) throws InvalidAgeException
	{
		try
		{
			if( age<18 )
			{
				throw new InvalidAgeException();
			}
			else
			{
				for( int x=0; x<names.length; x++ )
				{
					if( votesToCandidate == names[x] )
					{
						votes[x]++;
					}
				}
			}
		}
		finally
		{

		}
	}

	public void printResults()
	{
		for( int x=0; x<names.length; x++ )
		{
			System.out.println("Candidate " + names[x] + " received " + votes[x] + " votes");
		}
	}
} 



public class SecondTask
{
	public static void main(String[] args)
	{
		VotingMachine v1 = new VotingMachine();
		String[] candidates = {"Imran Khan", "Nawaz Badmash", "Bilawal Bhutto", "Altaf Bhai", "Molana Fazal-ur-Rehman"};
		v1.addCandidates(candidates);
		try
		{
			v1.castVote(19, "Imran Khan");
			
		}
		catch( InvalidAgeException iae )
		{
			System.out.println("Exception: " + iae.getMessage());
		}

		v1.printResults();
		System.out.println("Program Continues...");

	}
}