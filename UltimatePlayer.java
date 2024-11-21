package ultimatefrisbee;

public class UltimatePlayer extends Person
{
	private static int jerseyNumber = 1;
	private String position;
	private int myJersey = jerseyNumber;
	
	public UltimatePlayer(String f, String l, String p)
	{
		super(f, l);
		setPosition(p);
		jerseyNumber++;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String p)
	{
		if (p.equals("cutter") || p.equals("handler")) 
		{
			position = p;
		}
		else 
		{
			position = p;
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n\tJersey #: " + myJersey + "\n\tPosition: " + position;
	}
}
