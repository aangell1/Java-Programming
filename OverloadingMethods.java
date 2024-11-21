package classwork;

import java.util.Scanner;

public class OverloadingMethods 
{
	
	public static double findMean(int int1, int int2, int int3)
	{
		int sum = int1 + int2 + int3;
		double mean = sum/3.0;
		return mean;
	}
	
	public static double findMean(int i, int u, int p, int j)
	{
		int sum = i + u + p + j;
		double mean = sum/4.0;
		return mean;
	}
	
	public static int changeNumOrNot(int pos)
	{
		if (pos >= 0)
		{
			pos *= 1;
			return pos;
		}
		if (pos < 0)
		{
			pos *= -1;
			return pos;
		}
		return 0;
	}
	
	public static int changeNumOrNot(double y)
	{
		return (int) y;
	}
	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter: ");
		int count = inputReader.nextInt();
		if (count == 3)
		{
			System.out.print("Please enter a number: ");
			int x = inputReader.nextInt();
			System.out.print("Please enter a number: ");
			int r = inputReader.nextInt();
			System.out.print("Please enter a number: ");
			int a = inputReader.nextInt();
			System.out.println("The mean of your numbers are " + findMean(x,r,a));
		}
		if (count == 4)
		{
			System.out.print("Please enter a number: ");
			int x = inputReader.nextInt();
			System.out.print("Please enter a number: ");
			int r = inputReader.nextInt();
			System.out.print("Please enter a number: ");
			int a = inputReader.nextInt();
			System.out.print("Please enter a number: ");
			int b = inputReader.nextInt();
			System.out.println("The mean of your numbers are " + findMean(x,r,a, b));
		}
		int neg = -1;
		double o = 3.77;
		System.out.println("Absolute value of your integer is: " + changeNumOrNot(neg));
		System.out.println("Your double truncated: " + changeNumOrNot(o));
		

	}

}
