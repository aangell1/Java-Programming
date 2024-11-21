package fractions;

/*
 * Name: Austin Angell
 * Date: 3/9/2020
 * Purpose: To make multiple methods for the fraction class and utilize them in different forms
 */

public class Fraction implements Comparable<Fraction>
{
	private int num;
	private int denom;
	
	public Fraction()
	{
		num = 0;
		denom = 1;
		//Initializes to the default fraction
	}
	public Fraction(int n, int d)
	{
		num = n;
		denom = d;
		simplify();
		//overrides constructor with parameters to make a unique fraction
	}
	
	public Fraction(double db)
	{
		double ulimit = 100000000;
		double t = db * ulimit;
		num = (int)t;
		denom = (int)ulimit;
		simplify();
		//converts fraction into a decimal
	}
	
	private void simplify()
	{
		int gcf=1;
		if(denom==0)
		{
			System.out.println("Error!");
			num=0;
			denom=1;
		}
		else if(num==0)
		{
			num=0;
			denom=1;
		}
		else
		{
			if (num < 0 && denom < 0)
			{
				num *= -1;
				denom *= -1;
			}
			if (num > 0 && denom < 0)
			{
				num *= -1;
				denom *= -1;
			}
			if (num < 0 && denom > 0)
			{
				int c = 1;
				while(c<=denom)
				{
					if(num%c==0 && denom%c==0)
					{
						gcf=c;
					}
					c++;
				}
			}
			if(num>denom)
			{
				if(num%denom==0)
				{
					int c = 1;
					while(c<=denom)
					{
						if(num%c==0 && denom%c==0)
						{
							gcf=c;
						}
						c++;
					}
				}
				else 
				{
					int c = 1;
					while(c<denom)
					{
						if(num%c==0 && denom%c==0)
						{
							gcf=c;
						}
						c++;
					}
				}
				
			}
			else
			{
				if(denom%num==0)
				{
					int c = 1;
					while(c<=num)
					{
						if(num%c==0 && denom%c==0)
						{
							gcf=c;
						}
						c++;
					}
				}
				else 
				{
					int c = 1;
					while(c<num)
					{
						if(num%c==0 && denom%c==0)
						{
							gcf=c;
						}
						c++;
					}
				}
			}
			num=num/gcf;
			denom=denom/gcf;
			//simplifies any fraction to its most simplest form 
		}
	}
	public int getNumerator()
	{
		return num;
		//accessor method, returns value of numerator
	}
	public int getDenominator()
	{
		return denom;
		//accessor method, return value of denominator
	}
	public void setNumerator(int n)
	{
		num = n;
		//mutator method, sets value of numerator to parameter
	}
	public void setDenomonator(int d)
	{
		denom = d;
		//mutator method, sets value of denominator to parameter
	}
	public Fraction add(Fraction f)
	{
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction add = new Fraction((num*d)+(n*denom), denom*d);
		add.simplify();
		return add;
		//adds two fractions together then simplifies to most simple term
	}
	public Fraction subtract(Fraction f)
	{
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction diff= new Fraction((num*d)-(n*denom), denom*d);
		diff.simplify();
		return diff;
		//subtracts two fractions together then simplifies to most simple term
	}
	public Fraction multiply(Fraction f)
	{
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction multi = new Fraction((num*n), denom*d);
		multi.simplify();
		return multi;
		//multiplies two fractions together then simplifies to most simple term
	}
	public Fraction divide(Fraction f)
	{
		int n = f.getNumerator();
		int d = f.getDenominator();
		Fraction divide= new Fraction((num*d), denom*n);
		divide.simplify();
		return divide;
		//divides two fractions together then simplifies to most simple term
	}
	public double toDouble()
	{
		return (double)num/denom;
		//accessor method for the decimal form of a fraction
	}
	public int compareTo(Fraction f)
	{
		if (f.toDouble()==(double)num/denom)
		{
			return 0;
		}
		else if(f.toDouble()<(double)num/denom) 
		{
			return 1;
		}
		else 
		{
			return -1;
		}
		//compares the value of fractions to determine if they are equal or not
	}
	public boolean equals(Fraction f)
	{
		if((double)num/denom == f.toDouble())
		{
			return true;
		}
		else
		{
			return false;
		}
		//compares the fraction to the decimal to see if they are equal
	}
	public boolean equals(double dd)
	{
		if ((Math.abs(dd-((double)num/denom)) <= 0.00000001))
		{
			return true;
		}
		else
		{
			return false;
		}
		// if the decimal difference is less than or equal to .00000001 then they are set equal
	}
	public boolean equals(int n, int d)
	{
		Fraction fraction1= new Fraction(num, denom);
		Fraction fraction2= new Fraction(n,d);
		if(fraction1.equals(fraction2))
		{
			return true;
		}
		else
		{
			return false;
		}
		//compares two fractions to see if they are equal
	}
	public String toString()
	{
		if(denom==0)
		{
			return "0/1";
		}
		else
		{
			return num + "/" + denom;
		}
		//return a string representing the fraction
	}
}
