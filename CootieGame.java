package cootie;

import java.util.Scanner;

public class CootieGame 
{

	public static void main(String[] args) 
	{
	Scanner inputReader = new Scanner(System.in);
	int players;
	System.out.println("How many players are there?  (Please enter a number between 2 and 4)");
	players = inputReader.nextInt();
	if (players <= 1 || players >= 5)
	{
		System.out.println("Please enter a valid number of players");
		System.out.println("How many players are there?  (Please enter a number between 2 and 4)");
		players = inputReader.nextInt();
	}
	switch (players)
	{
	case 1: 
		
	}
	
	

	}

}
