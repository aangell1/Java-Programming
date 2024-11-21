package ultimatefrisbee;

public class Coach extends Person
{
	private String role;
	
	public Coach(String f, String l, String r)
	{
		super(f, l);
		role = r;
	}
	
	public void setCoach(String r)
	{
		r="Head Coach";
	}
	
	public String toString()
	{
		return super.toString() + "\n\t Role: " + role;
	}
}
