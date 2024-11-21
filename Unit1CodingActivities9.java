package codingactivities;
/*
 * Name: Austin Angell
 * Date: 9/10/2019
 * Purpose: To calculate the net pay from hours worked and their rate.  Also deducting the tax that is involved(#9).
 */
import java.util.Scanner;

public class Unit1CodingActivities9 
{

	public static void main(String[] args) 
	{
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
