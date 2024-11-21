package unit5codingactivititespart2;

/*
 * Name: Austin Angell
 * Date: 1/29/2020
 * Purpose: To compute the largest, second largest and third largest numbers in a set of number and report the index found.	
 */

import java.util.Arrays;

import java.util.Scanner;

public class LargeActivities5 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Please input the number of integers you would like to enter: ");
		int x = inputReader.nextInt();
		int[] array5 = new int[x];
		int count = 1;
		while (x<3) 
		{
			System.out.println("Please enter a number that is 3 or larger.");
			System.out.print("Please input the number of integers you would like to enter: ");
			x = inputReader.nextInt();
		}
		if (x>=3)
		{
			for (int j = 0; j<x; j++)
			{
				System.out.print("Please enter integer " + count + ":");
				array5[j] = inputReader.nextInt();
				count++;
			}
		}
		int[]array2 = array5.clone();
		Arrays.sort(array5);
		int v, a, b, z, o, l;
		v = array5[x-1];
		a = array5[x-2];
		b = array5[x-3];
		z = 0;
		o = 0;
		l = 0;
		for (int i = 0; i<array5.length; i++)
		{
			if (array2[i] == v)
			{
				z = i;
			}
			if (array2[i] == a)
			{
				o = i;
			}
			if (array2[i] == b)
			{
				l = i;
			}
		}
		System.out.println("The largest number entered was " + array5[x-1] + " at index " + z);
		System.out.println("The second largest number entered was " + array5[x-2] + " at index " + o);
		System.out.println("The third largest number entered was " + array5[x-3] + " at index " + l);

	}

}
