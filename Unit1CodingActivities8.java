package codingactivities;

import java.util.Scanner;
/*
 * Name: Austin Angell
 * Date: 9/10/2019
 * Purpose: To compute an input from the user and giving back the correct amount listen in change.
 */
public class Unit1CodingActivities8 
{

	public static void main(String[] args) 
	{
		
		Scanner inputReader = new Scanner(System.in);
		double purchasePrice;
		double amountRecieved;
		System.out.print("Enter purchase price: ");
		purchasePrice = inputReader.nextDouble();
		System.out.print("\nEnter amount recieved: ");
		amountRecieved = inputReader.nextDouble();
		double changeDue;
		changeDue = (amountRecieved - purchasePrice);
		System.out.print("\nChange Due: " + changeDue);
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		dollars = (int)changeDue;
		System.out.print("\n\nDollars:\t\t" + dollars);
		quarters = (int)(((changeDue - dollars)*100)%100)/25;
		System.out.print("\nQuarters:\t\t" + quarters);
		dimes = (int)((((changeDue-dollars)*100)%100)%25)/10;
		System.out.print("\nDimes:\t\t\t" + dimes);
		nickels = (int)(((((changeDue-dollars)*100)%100)%25)%10)/5;
		System.out.print("\nNickels:\t\t" +nickels);
		pennies = (int)(((((changeDue-dollars)*100)%100)%25)%10)%5;
		System.out.print("\nPennies\t\t\t" + pennies);
		inputReader.close();

	}

}
