package unit2codingactivities;

import java.util.Scanner;

public class switchHw 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Welcome to my Slogan Menu!");
		System.out.println("Please choose which slogan you would like to see ... well, read really.");
		System.out.print("1 - Nike\n2 - Arby's\n3 - EA Sports\n4 - Popeyes\n5 - Subway");
		int selection;
		System.out.print("\nYour selection: ");
		selection = inputReader.nextInt();
		switch(selection)
		{
		case 1:
			System.out.print("Just do it.");
			break;
		
		case 2:
			System.out.print("We have the meats!");
			break;
		
		case 3:
			System.out.print("EA Sports, Its in the game.");
			break;
		
		case 4:
			System.out.print("Love that chicken from Popeyes!");
			break;
		
		case 5:
			System.out.print("Eat Fresh.");
			break;
			
		default:
			System.out.print("You have not inputed a value.");
			break;
		}
		inputReader.close();
		
		
		
		
		

	}

}
