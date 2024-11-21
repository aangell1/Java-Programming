package unit2codingactivities;

import java.util.Scanner;

public class WhileHw 
{

	public static void main(String[] args) 
	{
		/*
		 * Name: Austin Angell
		 * Date: 10/6/2019
		 * Purpose: Use test scores inputed by the user to make the mean and if a invalid test score is given then produced the mean.
		 */
		
		
		Scanner inputReader = new Scanner(System.in);
//		int testScore, sum;
//		double counter;
//		sum = 0;
//		testScore = 0;
//		counter = -1;
//		
//		
//		while (testScore>=0)
//		{
//			counter++;
//			sum += testScore;
//			System.out.print("Enter a test score: ");
//			testScore = inputReader.nextInt();
//		}
//		System.out.print("The mean of the test scores is: " + sum/counter);
		
		/*
		 * Name: Austin Angell
		 * Date: 10/6/2019
		 * Purpose: To print the even number between what the user inputs and to print the number if it is even
		 */
		int num1, num2;
		System.out.print("Please enter two integers: ");
		num1 = inputReader.nextInt();
		num2 = inputReader.nextInt();
		if (num1 % 2 == 1)
		{
			num1++;
		}
		while (num1 <= num2)
		{
			System.out.print(num1 + " ");
			num1 += 2;
		}
		if (num2 % 2 == 1)
		{
			num2++;
		}
		while (num2 <= num1)
		{
			System.out.print(num2 + " ");
			num2 += 2;
		}
		inputReader.close();
		
	}

}
