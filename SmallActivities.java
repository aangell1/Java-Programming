package unit2codingactivitiespart3;

/*
 * Name: Austin Angell
 * Date: 10/23/2019
 * Purpose: Complete activities using for loops.
 */

import java.util.Scanner;

public class SmallActivities 
{

	public static void main(String[] args) 
	{
	Scanner inputReader = new Scanner(System.in);
	int selection;
	do
	{	
		System.out.print("Which activity would you like to run: \nActivity 1 - Computes the squares and the cubes of numbers 1-10.\nActivity 2 - Adds the numbers between the user inputs and prints the sum.\nActivity 3 - Produces the largest, smallest and sum between a set of numbers.\nActivity 4 - Prints a box of X's in a 8x3 dimension.\nActivity 5 - Prints a right triangle of X's with a height of 8 and a base of 8.\nActivity 6 - Computes a multiplication table from the numbers 1-5.\nType 7 to exit.\nYour choice: ");
		selection = inputReader.nextInt();
		switch (selection)
		{
		case 1: 
			for (int x = 1; x>0 && x<=10; x++)
			{
				int exponents, cube;
				exponents = x*x;
				cube = x*x*x;
				System.out.print("  The square of " + x + " is " + exponents + ".\t\t\tThe cube of " + x + " is " + cube + ".\n");
			}
			break;
		case 2:
			System.out.print("Please enter the starting number: ");
			int z = inputReader.nextInt();
			System.out.print("Please enter the ending number: ");
			int b = inputReader.nextInt();
			int sum = 0;
			for (int c = z; c<=b; c++)
			{
				sum += c;
				//add to c then store it as the sum
			}
			for (int c = z; c>=b; c--) 
			{
				sum += c;
				//subtract from c then store it as the sum
			}
			System.out.println("The sum of the numbers between " + z + " and " + b + " is " + sum);
			break;
		case 3:
			int input;
			int sum2 = 0;
			int largestNumber;
			int smallestNumber;
			int userInput = 0;
			System.out.print("How many numbers will be entered?\n");
			input = inputReader.nextInt();
			if (input<=0)
			{
				largestNumber= 0;
				smallestNumber = 0;
				sum2 = 0;
			}
			else
			{
				System.out.print("Please enter the number 1: ");
				userInput = inputReader.nextInt();
				smallestNumber = userInput;
				largestNumber = userInput;
				sum2 += userInput;
				for (int count = 2; count <= input; count++)
				{
					System.out.print("Please enter the number " + count + ": ");
					userInput = inputReader.nextInt();
					if (userInput > largestNumber)
					{
						largestNumber = userInput;
					}
					if (userInput < smallestNumber)
					{
		
						smallestNumber = userInput;
					}
					sum2 += userInput;
				}
			}
			System.out.println("The largest number was " + largestNumber);
			System.out.println("The smallest number was " + smallestNumber);
			System.out.println("The sum of the numbers was " + sum2);
			break;
		case 4:
			final int LENGTH = 8;
			final int HEIGHT = 8;
			for (int c =1; c<=HEIGHT; c++)
			{
				
				for (int leng =1; leng<=LENGTH; leng++)
				{
					System.out.print("X");
					
				}
				System.out.println();
			}
			break;
		case 5:
			final int HEIGHT_TRIANGLE = 8;
			for (int count2 = 1; count2<=HEIGHT_TRIANGLE; count2++)
			{
				for (int count3 =1; count3<= count2; count3++)
				{
					//loop the counter to increase the amount of x's on each loop
					System.out.print("X");
					
				}
				System.out.print("\n");
			}	
			break;
		case 6:
			System.out.println("\n\t1\t2\t3\t4\t5");
			
			for ( int lengthOfTable = 1; lengthOfTable <= 5; lengthOfTable++)
			{
				System.out.print(lengthOfTable);
				for ( int heightOfTable = 1; heightOfTable <= 5; heightOfTable++)
				{
					//must loop the length of variable not only print but to multiply
					System.out.print("\t" + (heightOfTable*lengthOfTable));
					
				}
				System.out.print("\n");
			}
			break;
		}
		
		if ((selection <= 0) || (selection >= 8))
		{			
			System.out.print("Please enter a valid option: ");
			selection = inputReader.nextInt();
		}
		
		
		
		
	}
	while (selection>=1 && selection <=6);
	
	
		
		
	inputReader.close();
	
	
	
	}

}
