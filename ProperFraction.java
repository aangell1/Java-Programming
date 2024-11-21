package fractions;

/*
 * Name: Austin Angell
 * Date: 3/10/2020
 * Purpose: To simplify improper fractions into their proper form
 */

public class ProperFraction extends Fraction 
{
	public ProperFraction(int n, int d)
	{
		super(n, d);
		//calls to the parent constructor using super
	}
	public int getWhole()
	{
		return super.getNumerator()/super.getDenominator();
		//uses integer division to get the whole number of the proper fraction
	}
	
	public int getRemainder()
	{
		int x = super.getNumerator()%super.getDenominator();
		if (super.getNumerator()%super.getDenominator() < 0)
		{
			x *= -1;
		}
		return x;
		//gets the "numerator" of the proper fraction
	}
	public String toString()
	{
		if(getRemainder() == 0)
		{
			return "" + getWhole();
		}
		else if (getWhole() == 0)
		{
			return "" +  getRemainder() + "/" + super.getDenominator();
		}
		else
		{
			return getWhole() + " " +  getRemainder() + "/" + super.getDenominator();
		}
		//complies the proper fraction into a string format
	}
}
