package codingactivities;
/*
 * Name: Austin Angell
 * Date: 9/5/2019
 * Purpose: To complete all Unit 1 coding activities using strategies explained in class.
 */

import java.util.Scanner;

public class SmallAcitvies 
{

	public static void main(String[] args) 
	{
		/*
		 * Name: Austin Angell
		 * Date: 9/6/2019
		 * Purpose: To complete small activity #1 using strategies learned in class.
		 */
//		int myInt;
//		int myInt2;
//		int myInt3;
//		int myInt4;
//		int sumInt;
//		double meanDouble;
//		Scanner inputReader = new Scanner(System.in);
//		System.out.print("Please enter 4 integers: ");
//		myInt = inputReader.nextInt();
//		myInt2 = inputReader.nextInt(); 
//		myInt3 = inputReader.nextInt();
//		myInt4 = inputReader.nextInt();
//		sumInt = (myInt + myInt2 + myInt3 + myInt4);
//		System.out.println("The sum of your integers is " + sumInt);
//		meanDouble = sumInt/4.0;
//		System.out.print("The mean of your integers is " + meanDouble);
		/*
		 * Name: Austin Angell
		 * Date: 9/5/2019
		 * Purpose: To finish small activity #2 using strategies used in class.
		 */
//		int myInt;
//		Scanner inputReader = new Scanner(System.in);
//		double myDouble = 3.14;
//		int cInt = 2;
//		System.out.print("What is the radius of the circle?\n");
//		myInt = inputReader.nextInt();
//		double myDouble2 = 6.28*myInt;
//		System.out.println("Circumference: " + myDouble2);
//		double areaDouble = 3.14*myInt*myInt;
//		System.out.print("Area: " + areaDouble);
		/*
		 * Name: Austin Angell
		 * Date: 9/5/2019
		 * Purpose: To finish small activity #3 using strategies learned in class.
		 */
//		double myDouble;
//		Scanner inputReader = new Scanner(System.in);
//		System.out.print("Please input a decimal number: ");
//		myDouble = inputReader.nextDouble();
//		int resultInt;
//		resultInt = (int)myDouble;
//		System.out.print("Truncated result: " + resultInt);
		/*
		 * Name: Austin Angell
		 * Date: 9/5/2019
		 * Purpose: To complete activity #4 using strategies learned in class.
		 */
//		Scanner inputReader = new Scanner(System.in);
//		double myDouble;
//		System.out.print("Please input a decimal number: ");
//		myDouble = inputReader.nextDouble();
//		double newDouble = myDouble*100;
//		double myDouble2 = newDouble%100;
//		int modInt;
//		modInt = (int)myDouble2;
//		System.out.print("The first two digits after the decimal point are: " + modInt);
		/*
		 * Name: Austin Angell
		 * Date: 9/6/2019
		 * Purpose: To complete activity #5 using strategies learned in class.
		 */
//		Scanner inputReader = new Scanner(System.in);
//		double tempDouble;
//		System.out.print("Please enter a temperature in degrees Fahrenheit: ");
//		tempDouble = inputReader.nextDouble();
//		double tempDouble2;
//		tempDouble2 = (double)(tempDouble-32)*5/9;
//		System.out.println("That temperature in Celcius is " + tempDouble2);
//		double celDouble;
//		System.out.print("Please enter a temperature in degrees Celcius: ");
//		celDouble = inputReader.nextDouble();
//		double myDouble;
//		myDouble = ((celDouble*9)/5)+32;
//		System.out.print("That temperature in Fahrenheit is " + myDouble);
		/*
		 * Name: Austin Angell
		 * Date: 9/6/2019
		 * Purpose: To complete activity #6 using strategies learned in class.
		 */
		int myInt;
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Please enter a 3 digit positive integer: ");
		myInt = inputReader.nextInt();
		int hundredsInt;
		hundredsInt = (myInt/100)%10;
		int tensInt;
		tensInt = (myInt/10)%10;
		int onesInt;
		onesInt = myInt%10;
		System.out.print("\nThe digits are:\n" + hundredsInt);
		System.out.print("\n" + tensInt);
		System.out.print("\n" + onesInt);
		int sumInt;
		sumInt = hundredsInt + tensInt + onesInt;
		System.out.print("\n\n" + hundredsInt);
		System.out.print(" + " + tensInt);
		System.out.print(" + " + onesInt);
		System.out.print(" = " + sumInt);
		inputReader.close();
		
		
		
		
		
		
		
		
		
		
	
	
		
		

	}

}
