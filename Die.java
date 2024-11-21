package unit5codingactivititespart2;

public class Die 
{
	private int numSides;
	private int currentValue;
	//instant variables
	
	public Die (int n)
	{
		setNumSides(n);
		//call the mutator method
		rollDice();	
		//1 argument constructor
	}
	
	public void setNumSides(int n)
	{
		if(n<6)
		{
			numSides = 6;
			//default number of sides, nothing less than 6.
		}
		else 
		{
			numSides = n;
		}
		//mutator method
	}
	
	public Die()
	{
		this(6);
		//no argument constructor
	}
	
	public int rollDice()
	{
		return currentValue = (int)(Math.random()*numSides)+1;
	}
	
	public int getNumSides()
	{
		return numSides;
		//access method
	}
	
	public int getCurrentValue()
	{
		return currentValue;
		//access method
	}
	
	public void setCurrentValue(int n)
	{
		if (n>numSides)
		{
			currentValue = 1;
			//cannot have a value greater than a side length
		}
		else
		{
			currentValue = n;
		}
		//mutator method
	}
	
	public String toString()
	{
		return "The die has " + numSides + " sides and its current value is " + currentValue + ".";
		//overwriting the toString default method
	}
}
