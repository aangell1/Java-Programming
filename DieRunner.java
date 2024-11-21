package unit4codingactivities;

/*
 * Name: Austin Angell
 * Date: 9/8/2019
 * Purpose: To create dice with a certain number of sides from a class that is executed and compute methods for each die.
 */

public class DieRunner 
{
	public static void rollOff(Die d1, Die d2)
	{
		d1.rollDice();
		d2.rollDice();
		//call roll method from the class
		System.out.println("The first die rolled a " + d1.getCurrentValue());
		System.out.println("The second die rolled a " + d2.getCurrentValue());
		if (d1.getCurrentValue()>d2.getCurrentValue())
		{
			System.out.println(d1.getCurrentValue() + " is larger, so dice 1 wins the roll-off");
		}
		else if (d1.getCurrentValue()==d2.getCurrentValue())
		{
			System.out.print("Both dice rolled equal values, so the roll-off results into a tie.");
		}
		else
		{
			System.out.println(d2.getCurrentValue() + " is larger, so dice 2 wins the roll-off");
		}
		//compares the current value of each die
	}
	
	public static int compareSides(Die d1, Die d2)
	{
		if (d1.getNumSides()>d2.getNumSides())
		{
			return d1.getNumSides();
		}
		else
		{
			return d2.getNumSides();
		}
		//gets the number of sides from the access method, compares them then returns the largest one
	}
	
	public static void findDiceValue(Die d2)
	{
		int c = 1;
		while(c<=30)
		{
			d2.rollDice();
			System.out.print(d2.getCurrentValue() + " ");
			if(d2.getCurrentValue() == 20)
			{
				System.out.print("Critical Hit! ");
			}
			c++;
		}
		System.out.print("\n");
	}
	//prints the current value of a dice with 20 sides, labels critical hit if 20 is rolled
	public static void main(String[] args) 
	{
		Die d6 = new Die();
		Die d20 = new Die(20);
		System.out.println(d6);
		System.out.println(d20);
		rollOff(d6, d20);
		System.out.println("The larger number of sides of the two dice is: " + compareSides(d6, d20));
		findDiceValue(d20);
		d6.setCurrentValue(5);
		System.out.println(d6);
		Die d2 = new Die(2);
		System.out.println(d2);
		d2.setCurrentValue(8);
		System.out.print(d2);
	}
}
