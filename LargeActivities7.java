package unit3codingactivities;

import java.util.Scanner;

public class LargeActivities7 
{
	public static void findSquareroot(int y)
	{
		int counter = 1;
		double x1;
		final double START = 500.0;
		double x = (1.0/2)*(START + y/START);
		x1 = 0;
		System.out.println("Approximation 1 of the square root of " + y + " is " + x);
		while ( Math.abs(x1 - x) > .001)
		{
			counter++;
			x1 = x;
			x = (1.0/2)*(x + y/x);
			System.out.println("Approximation " + counter + " of the square root of " + y + " is " + x);
		
		}
		System.out.printf("The square root of " + y + " is approximately %.3f", x);
		
	}

	public static void main(String[] args)  
	{
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Please enter a number you would like to compute the square root of: ");
		int input = inputReader.nextInt();
		findSquareroot(input);
		inputReader.close();

	}

}
