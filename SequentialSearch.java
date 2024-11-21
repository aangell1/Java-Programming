package linearsearch;

import java.util.ArrayList;

public class SequentialSearch 
{

	public static int findNumLinear(int[] arr, int x)
	{
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
			return c;
		}
		else 
		{
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
	
	public static void main(String[] args) 
	{
	
	}

}
