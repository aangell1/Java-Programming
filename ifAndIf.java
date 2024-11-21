package classwork;

import java.util.Scanner;

/*
 * Name: Austin Angell
 * Date: 9/19/2019
 * Purpose: To compute the if homework using the strategies we learned in class.
 */

public class ifAndIf 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		
//		//If activity 1
		int temp;
		System.out.print("Please enter today's temperature: ");
		temp = inputReader.nextInt();
		if (temp<=32)
		{
			System.out.print("Prepare for snow!\n");
		}
		else if (temp>32)
		{
			System.out.print("No snow today!\n");
		}
		System.out.println("Thank you for using APCS.com.");
		
		//If activity 2
	
		
		int x;
		int y;
		System.out.print("Please enter two integers: ");
		x = inputReader.nextInt();
		y = inputReader.nextInt();
		if (x==y)
		{
			System.out.print("Your numbers are equal!\n");
			System.out.print(x + " and " + y + " are the same.");
		}
		else
		{
			System.out.print("Your numbers are not equal.\n");
			System.out.print(x + " and " + y + " are not the same.");
		}
	
		int grade;
		System.out.print("Please enter the grade as a number: ");
		grade = inputReader.nextInt();
		if (grade==4)
		{
			System.out.print("A");
		}
		else if (grade==3)
		{
			System.out.print("B");
			
		}
		else if (grade==2)
		{
			System.out.print("C");
		}
		else if (grade==1)
		{
			System.out.print("D");
		}
		else if (grade==0)
		{
			System.out.print("F");
		}
		else
		{
			System.out.print("Dunno ... Q?");
		}
	
	
	}

}
