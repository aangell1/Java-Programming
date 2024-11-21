package anagramsproject;

import java.util.Scanner;

public class AnagramRunner 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
		String first = "Rakow";
		String second = "Radke";
		if (Anagram.testAnagram(first, second))
		{
			System.out.println("Anagrams!");
		}
		else 
		{
			System.out.println("Not anagrams.");
		}
		

	}

}
