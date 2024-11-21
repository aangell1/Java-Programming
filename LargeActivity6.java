package unit5codingactivititespart2;

/*
 * Name: Austin Angell
 * Date: 2/02/2020
 * Purpose: To use statistics and computer science to compute different elements of a random integer array.
 */

import java.util.Arrays;

public class LargeActivity6 
{

	public static int findFrequency(int n, int[] arr)
	{
		int p = 0;
		int h = 0;
		while(h<arr.length)
		{
			if (n==arr[h])
			{
				p++;
			}
			h++;
		}
		return p;
	}
	
	public static double findMean(int[] arr2)
	{
		int mean = 0;
		for (int o = 0; o<arr2.length; o++)
		{
			mean += arr2[o];
		}
		return mean/100.0;
	}
	
	public static double findMedian(int[] arr3)
	{
		Arrays.sort(arr3);
		int y = arr3[50];
		int f = arr3[51];
		double sum = y + f;
		double median = sum/2;
		return median;	
	}

	public static void main(String[] args) 
	{
		int[] array = new int [100];
		int i = 0;
		while (i<array.length)
		{
			array[i] = (int)(Math.random()*101)-50;
			i++;
		}
		int count1 = -50;
		int count2 = -50;
		for (int rows = 0; rows<10; rows++)
		{
			System.out.print("Number:\t");
			int numLimit = 0;
			while (numLimit<10)
			{
				System.out.print(count1 + "\t");
				count1++;
				numLimit++;
			}
			if (count1==50)
			{
				System.out.print(count1);
			}
			System.out.print("\nFreq:\t");
			int freqLimit = 0;
			while (freqLimit<10)
			{
				System.out.print(findFrequency(count2, array) + "\t");
				count2++;
				freqLimit++;
			}
			System.out.println();
			if (count2 == 50)
			{
				System.out.print(findFrequency(count2, array) + "\t");
			}
			System.out.println();
		}
		int mode = 0;
		for (int g = -50; g<50; g++)
		{
			if (findFrequency(g, array) > findFrequency(mode, array))
			{
				mode = g;
			}
		}
		System.out.print("\nThe mean is: " + findMean(array));
		System.out.print("\nThe median is: " + findMedian(array));
		System.out.print("\nThe mode is: " + mode);
	}

}
