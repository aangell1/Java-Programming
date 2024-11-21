package sortingcodingtasks;
/*
 * Name: Austin Angell
 * Date: 4/20/2020
 * Purpose: To sort an array of items using multiple methods.
 */

import java.util.Arrays;

import java.util.ArrayList;

public class sort 
{
	public static void sortArraySelection(int[] array)
	{
		int i = 0;
		while(i<array.length)
		{
			int count=i;
			int min = array[count];
			int c = 1;
			while(c<array.length)
			{
				if(min>array[c])
				{
					min = array[c];
					count = c;
					//finding the minimum number
					
				}
				c++;
			}
			int swap= array[i];
			array[i]=array[count];
			array[count]=swap;
			//swapping with the lowest number found with the number at the specific index
			i++;
		}
		System.out.println(Arrays.toString(array));
	}
	public static ArrayList<String> sortArrayListSelection(ArrayList<String> s)
	{
		int i = 0;
		while(i<s.size())
		{
			int count = i;
			String l= s.get(count);
			int a = i;
			while(a<s.size())
			{
				if(s.get(a).compareTo(l)>0)
				{
					l=s.get(a);
					count=a;
					//finds the smallest string
				}
				a++;
			}
			String swap = s.get(i);
			s.set(i, s.get(count));
			s.set(count,swap);
			//swaps the strings with the min
			i++;
		}
		return s;
	}
	public static void sortArrayInsertion(int[] array)
	{
		int i = 1;
		while(i<array.length)
		{
			int a = 0;
			while(i>a)
			{
				if(array[i]<array[a])
				{
					int swap = array[i];
					array[i]=array[a];
					array[a]=swap;
					//swaps the spots at the index
				}
				a++;
			}
			i++;
		}
		System.out.println();
	}
	public static ArrayList<String> sortArrayListInsertion(ArrayList<String> s)
	{
		int i = 1;
		while(i<s.size())
		{
			int a = 0;
			while(i>a)
			{
				if(s.get(a).compareTo(s.get(i))<0)
				{
					String swap= s.get(a);
					s.set(a, s.get(i));
					s.set(i,swap);
					//again, swaps at specific index but just with the string size 
				}
				a++;
			}
			i++;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		int[] array = {7, 1, 15, 2, 3, -9};
		sortArraySelection(array);
		sortArrayInsertion(array);
	}

}
