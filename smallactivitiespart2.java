package unit2codingactivitiespart2;

import java.util.Scanner;

public class smallactivitiespart2 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int selection;
		do
		{
			System.out.print("What activity would you like to run?\nActivity 1 pertains to computing a factorial.\nActivity 2 determines if a number is prime or not.\nActivity 3 is computing the largest value of a integer when the user types in a set of numbers.\nActivity 4 is displaying a Fahrenheit and Celsius table.\nActivity 5 is computing the amount of consecutive integers to add to a value greater than the value entered.\nPress 6 to exit the menu.\nYour choice: ");
			selection = inputReader.nextInt();
			switch (selection)
			{
			case 1: 
				int num1, counter1;
				System.out.println("What number would you like to compute the factorial of?");
				num1 = inputReader.nextInt();
				System.out.print(num1);
				counter1 = 1;
				while (num1>1)
				{
					counter1 = counter1*num1;
					counter1 = (num1-1)*(counter1);
					num1 = (num1-2);
				}
				System.out.println("! = " + counter1);
				break;
			
			case 2:
				int number, counter;
				System.out.print("Please enter a postive integer: ");
				number = inputReader.nextInt();
				counter = 0;
				if (number == 1)
				{
					System.out.print("NOT PRIME\n");
				}
				if (number == 0)
				{
					System.out.print("NOT PRIME\n");
				}
				while (number>=0 && counter>=0 && number != 1 && number != 0)
				{
					if ((number % 2 == 0) || (number % 3 == 0) || (number % 4 == 0) || (number % 5 == 0) || (number % 6 == 0) || (number % 7 == 0) || (number % 8 == 0) || (number % 9 == 0) || (number % 10 == 0))
					{
						System.out.print("NOT PRIME\n");
					}	
					else if ((number/number == 1) && number/1 == number)
					{
						System.out.print("PRIME\n");
					}
				counter--;
				}
				break;
				
			case 3:
				int integer, largestNumber;
				integer = 1;
				largestNumber = 1;
				while (integer!=0)
				{
					System.out.print("Please enter an integer: ");
					integer = inputReader.nextInt();
					if (integer > largestNumber)
					{
						largestNumber = integer;
					}
					else if (integer < largestNumber)
					{
						largestNumber += 0;
					}
				}
				System.out.println("The largest number is: " + largestNumber);
				break;
			
			
			case 4:
				int farStart, farEnd;
				double celsiusStart;
				System.out.print("Please enter the starting Fahrenheit temperarture: ");
				farStart = inputReader.nextInt();
				System.out.print("Please enter the ending Fahrenheit temperature: ");
				farEnd = inputReader.nextInt();
				celsiusStart = 0;
				System.out.print("Fahrenheit\tCelsius");
				while (farStart <= farEnd)
				{
					celsiusStart = ((((double)farStart-32)*5)/9);
					System.out.printf("\n" + farStart + "\t\t%.2f", celsiusStart);
					farStart++;
					
				}
				while (farStart >= farEnd)
				{
					celsiusStart = ((((double)farStart-32)*5)/9);
					System.out.printf("\n" + farStart + "\t\t%.2f", celsiusStart);
					farStart--;
					
				}
				System.out.print("\n");
				break;
			
			
			case 5: 
				int input,int1, c, result, one;
				System.out.print("Please enter the number you would like the sum to exceed: ");
				input = inputReader.nextInt();
				one = 1;
				int1 = 1;
				c = 0;
				result = 0;
				while (result <= input)
				{
					result += int1;
					c++;
					int1++;
				}
				System.out.println("You must add the " + c + " numbers between " + one + " and " + c + " to get " + result + " and exceed " + input);
				break;
			}
		}
		
	
		while (selection>=0 && selection<=5);
		inputReader.close();
	
	}

}
