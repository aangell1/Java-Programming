package linearsearch;

/*
 * Name: Austin Angell
 * Date: 04/20/2020
 * Purpose: To sort data using a binary technique.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch 
{
	public static String findNumBinary(int[]array, int c)
	{
		Arrays.sort(array);
		int min = 0;
		int max = array.length-1;
		int midpoint= (min+max)/2;
		while(max>min)
		{
			if(array[midpoint]>c)
			{
				max = midpoint-1;
				midpoint=(max + min)/2;
				if(array[midpoint]==c)
				{
					return "index: " + midpoint;
				}
			}
			else if(array[midpoint]<c)
			{
				min = midpoint+1;
				midpoint=(max + min)/2;
				if(array[midpoint] == c)
				{
					return "index: " + midpoint;
				}
			}
			else if(array[midpoint] == c)
			{
				return "index: " + midpoint;
			}
		}
		return "index: " + -1;
	}
	public static String findWord(ArrayList<String> arrayS, String s)
	{
		Collections.sort(arrayS);
	    int min = 0;
	    int max = arrayS.size() - 1;
	    int midpoint;
	    while (min <= max)
	    {
	        midpoint = (max + min ) / 2;
	        if (s== arrayS.get(midpoint)) 
	        {
	            return "index: " + midpoint;
	        } 
	        else if (s.compareTo(arrayS.get(midpoint)) < 0) 
	        {
	            max = midpoint - 1;
	        } 
	        else
	        {
	            min = midpoint + 1;
	        }
	    }

	    return "index: "  + -1;
	}
	public static void main(String[] args) 
	{
		

	}

}
