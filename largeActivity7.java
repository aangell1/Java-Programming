package unit2codingactivities;

import java.util.Scanner;

public class largeActivity7 
{

	public static void main(String[] args) 
	{
		int completions;
		double yards;
		double attempts;
		double touchdowns;
		double interceptions;
		Scanner inputReader = new Scanner(System.in);
		double formula1;
		double formula2;
		double formula3;
		double formula4;
		double passerRating;
		System.out.print("Please enter the amount of attempts: ");
		attempts = inputReader.nextInt();
		System.out.print("Please enter the amount of completions: ");
		completions = inputReader.nextInt();
		System.out.print("Please enter the amount of yards: ");
		yards = inputReader.nextDouble();
		System.out.print("Please enter the amount of touchdowns: ");
		touchdowns = inputReader.nextInt();
		System.out.print("Please enter the amount of interceptions: ");
		interceptions = inputReader.nextInt();
		formula1 = (((completions/attempts)-.3)*5);
		formula2 = ((yards/attempts)-(3))*(.25);
		formula3 = ((touchdowns/attempts)*20);
		formula4 = 2.375-((interceptions/attempts)*25);
		if (formula1>=2.375)
		{
			formula1 = 2.375;
		}
		else if (formula1<=0)
		{
			formula1 = 0;
		}
		if (formula2>=2.375)
		{
			formula2 = 2.375;
		}
		else if (formula2<=0)
		{
			formula2 = 0;
		}
		if (formula3>=2.375)
		{
			formula3 = 2.375;
		}
		if (formula4<=0)
		{
			formula4 = 0;
		}
		passerRating = (((formula1 + formula2 + formula3 + formula4)/6)*100);
		System.out.printf("The NFL Passer Rating is: %.2f", passerRating);
		inputReader.close();
	}
}
