package codingactivities;
/*
 * Name: Austin Angell
 * Date: 9/7/2019
 * Purpose: To complete the long activities using strategies learned in class.
 */

import java.util.Scanner;

public class LongActivities 
{

	public static void main(String[] args) 
	{
		/*
		 * Name: Austin Angell
		 * Date: 9/7/2019
		 * Purpose: To complete large activity #7 using strategies learned in class.
		 */
//		Scanner inputReader = new Scanner(System.in);
//		int myInt;
//		int myInt2;
//		int myInt3;
//		System.out.print("Please enter three website ratings: ");
//		myInt = inputReader.nextInt();
//		myInt2 = inputReader.nextInt();
//		myInt3 = inputReader.nextInt();
//		double myDouble4;
//		double myDouble5;
//		System.out.print("\nPlease enter two ratings from focus groups: ");
//		myDouble4 = inputReader.nextDouble();
//		myDouble5 = inputReader.nextDouble();
//		double myDouble6;
//		System.out.print("\nPlease enter the average movie critic rating: ");
//		myDouble6 = inputReader.nextDouble();
//		double meanwebDouble;
//		meanwebDouble = (myInt + myInt2 + myInt3)/3.0;
//		System.out.println("\nAverage website rating: " + meanwebDouble);
//		double meanfgDouble;
//		meanfgDouble = (myDouble4 + myDouble5)/2;
//		System.out.println("Average focus group rating: " + meanfgDouble);
//		System.out.println("Average movie critic rating: " + myDouble6);
//		double meanovrwebDouble;
//		meanovrwebDouble = meanwebDouble*.2;
//		double meanovrfgDouble;
//		meanovrfgDouble = meanfgDouble*.3;
//		double ovrmcrDouble;
//		ovrmcrDouble = myDouble6*.5;
//		double ovrDouble;
//		ovrDouble = (meanovrwebDouble + meanovrfgDouble + ovrmcrDouble);
//		System.out.print("Overall movie rating: " + ovrDouble);
		/*
		 * Name: Austin Angell
		 * Date: 9/10/2019
		 * Purpose: To complete large activity #8 with strategies learned in class.
		 */
//		Scanner inputReader = new Scanner(System.in);
//		double purchaseprice;
//		double amountrecieved;
//		System.out.print("Enter purchase price: ");
//		purchaseprice = inputReader.nextDouble();
//		System.out.print("\nEnter amount recieved: ");
//		amountrecieved = inputReader.nextDouble();
//		double changedue;
//		changedue = (amountrecieved - purchaseprice);
//		System.out.print("\nChange Due: " + changedue);
//		int dollars;
//		int quarters;
//		int dimes;
//		int nickels;
//		int pennies;
//		dollars = (int)changedue;
//		quarters = (int)((changedue-dollars)/25);
//		System.out.print("\n\nDollars:\t\t" + dollars);
//		System.out.print("\nQuarters:\t\t" + quarters);
//		dimes = (int)(((changedue-dollars)%25)/10);
//		System.out.print("\nDimes:\t\t" + dimes);
//		nickels = (int)(((changedue-dollars)%25)%10)/5;
//		System.out.print("\nNickels:\t\t" +nickels);
//		pennies = (int)((((changedue-dollars)%25)%5)/1);
//		System.out.print("\nPennies\t\t" + pennies);
		/*
		 * Name: Austin Angell
		 * Date: 9/10/2019
		 * Purpose: To calculate the net pay from hours worked and their rate.  Also deducting the tax that is involved(#9).
		 */
		
		double hoursWorked;
		double hourlyRate;
		Scanner inputReader = new Scanner(System.in);
		System.out.print("Enter the number of hours worked: ");
		hoursWorked = inputReader.nextDouble();
		System.out.print("Enter the hourly rate: ");
		hourlyRate = inputReader.nextDouble();
		System.out.print("\n\nHours worked: \t\t\t\t" + hoursWorked);
		System.out.print("\nHourly rate: \t\t\t\t" + hourlyRate);
		double grossPay;
		grossPay = hoursWorked*hourlyRate;
		System.out.print("\n\nGross pay: \t\t\t\t$" + grossPay + "0");
		double federalTax;
		federalTax = grossPay*.18;
		System.out.print("\nFederal tax (18%)       \t\t$" + federalTax + "0");
		double socialSecurity;
		socialSecurity = grossPay*.08;
		System.out.print("\nSocial security tax (8%)\t\t$" + socialSecurity + "0");
		double stateTax;
		stateTax = grossPay*.032;
		System.out.print("\nState tax (3.2%)        \t\t$" + stateTax + "0");
		double localTax;
		localTax = grossPay*.02;
		System.out.print("\nLocal tax (2%)          \t\t$" + localTax + "0");
		double deductible;
		deductible = federalTax + socialSecurity + stateTax + localTax;
		double netPay;
		netPay = grossPay-deductible;
		System.out.print("\n\nNet pay                     \t\t$" + netPay + "0");
		inputReader.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
