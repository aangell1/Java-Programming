package ultimatefrisbee;

public class Person 
{
	private String firstName;
	private String lastName;
	
	public Person(String f, String l)
	{
		setFirstName(f);
		setLastName(l);
	}
	
	public String toString()
	{
		return lastName + ", " + firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setFirstName(String f)
	{
		firstName=f;
	}
	public void setLastName(String l)
	{
		lastName=l;
	}
}
