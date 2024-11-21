package searchandsortactivities;

/*
 * Name: Austin  Angell
 * Date: 4/27/2020
 * Purpose: To complete an array of tasks using searching and sorting techniques.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class searchAndSortCodingActivities 
{
	public static String findNumBinary(int[]array, int c)
	{
		Arrays.sort(array);
		int min = 0;
		int max = array.length-1;
		int midpoint= (min+max)/2;
		System.out.println("Array being passed: " + array.toString());
		System.out.println("Target value: " + c);
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
					return "Index at the value returned: " + midpoint;
				}
			}
			else if(array[midpoint] == c)
			{
				return "Index at the value returned: " + midpoint;
			}
		}
		return "Index at the value returned: " + -1;
	}
	public static String findWord(ArrayList<String> arrayS, String s)
	{
		Collections.sort(arrayS);
	    int min = 0;
	    int max = arrayS.size() - 1;
	    int midpoint;
	    System.out.println("ArrayList being passed: " + arrayS.toString());
	    System.out.println("Target word: " + s);
	    while (min <= max)
	    {
	        midpoint = (max + min ) / 2;
	        if (s== arrayS.get(midpoint)) 
	        {
	            return "Index at target word: " + midpoint;
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

	    return "Index at target word: "  + -1;
	}
	public static int findNumLinear(int[] arr, int x)
	{
		System.out.println("Array being passed: " + arr.toString());
		System.out.println("Target value: " + x);
		int a = 0;
		int c = 0;
		for(int i = 0; i<arr.length; i++)
		{
			a = arr[i];
			if (arr[i] > a)
			{
				a = arr[i];
				c = i;
				//makes min value equal to the smallest value found
			}
		}
		if (c >= 0)
		{
			System.out.println("Value returned: " + c);
			return c;
		}
		else 
		{
			System.out.println("Value returned: -1");
			return -1;
			//Guarantees something is returned
		}
	}
	
	public static String findByLetter(ArrayList<String> arr, String s1)
	{
		System.out.println("Letter: " + s1);
		int i = 0;
		while(i<arr.size())
		{
			String word= arr.get(i);
			if(word.substring(0,1).equals(s1))
			{
				return "The word with the letter: " + arr.get(i);
				//returns the string if the start of the word is the correct character
			}
			i++;
		}
		return null;
	}
	public static void sortArraySelection(int[] array)
	{
		int i = 0;
		System.out.println("Array being sorted: " + array.toString());
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
		System.out.println("Array being sorted: " + s.toString());
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
		System.out.println("Array being sorted: " + array.toString());
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
		System.out.println("Sorted array: " + array.toString());
	}
	public static ArrayList<String> sortArrayListInsertion(ArrayList<String> s)
	{
		int i = 1;
		System.out.println("Array being sorted: " + s.toString());
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
		int arr[] = {5, 7, 3, 2, 8, 9};
		findNumLinear(arr, 0);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("boss");
		arrayList.add("hello");
		arrayList.add("austin");
		System.out.println(findByLetter(arrayList, "a"));
		int arr2[] = {4, 10, 5, 1, 3, 8, 6};
		System.out.println(findNumBinary(arr2, 8));
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("angell");
		arrayList2.add("patriots");
		arrayList2.add("hi");
		arrayList2.add("austin");
		arrayList2.add("super");
		System.out.println(findWord(arrayList2, "patriots"));
		int[] arr3 = {-5, 23, 16, 1, 0, -20, 4};
		sortArraySelection(arr3);
		ArrayList<String> arrayList3 = new ArrayList<String>();
		arrayList3.add("boston");
		arrayList3.add("harvard");
		arrayList3.add("goodbye");
		arrayList3.add("austin");
		arrayList3.add("awesomeness");
		System.out.print(sortArrayListSelection(arrayList3));
		int[] arr4 = {2, 43, -16, -1, 7, -20, 8};
		sortArrayInsertion(arr4);
		ArrayList<String> arrayList4 = new ArrayList<String>();
		arrayList4.add("foxburough");
		arrayList4.add("trumpet");
		arrayList4.add("return");
		arrayList4.add("austin");
		arrayList4.add("cool");
		System.out.print(sortArrayListInsertion(arrayList4));

	}

}
