package ultimatefrisbee;

public class Captain extends UltimatePlayer
{
	private String captain;
	
	public Captain(String f, String l, String p, boolean t)
	{
		super(f, l, p);
		setCaptain(t);
	}
	
	public void setCaptain(boolean t)
	{
		if (t == true)
		{
			captain= "offense";
		}	
		else
		{
			captain= "defense";
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n\tCaptain: " + captain;
	}
}
