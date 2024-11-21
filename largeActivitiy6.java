package unit2codingactivities;

import java.util.Scanner;

/*
 * Name: Austin Angell
 * Date:9/24/2019
 * Purpose: To construct a box given a point, the base, and height and confirming if a point is inside the box.
 */
public class largeActivitiy6 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int xInput = 1;
		int yInput  = -3;
		//bottom left hand corner inputs
		int height = 5;
		int length = 3;
		//box dimensions
		int xCoordinate;
		int yCoordinate;
		int xLength;
		int yHeight;
//		//test point
//		System.out.print("Enter the x coordinate of the bottom left corner of the box: ");
//		xInput = inputReader.nextInt();
//		System.out.print("Enter the y coordinate of the bottom left corner of the box: ");
//		yInput = inputReader.nextInt();
//		System.out.print("Enter the height of the box: ");
//		height = inputReader.nextInt();
//		System.out.print("Enter the length of the box: ");
//		length = inputReader.nextInt();
		System.out.print("Enter the x coordinate of the point: ");
		xCoordinate = inputReader.nextInt();
		System.out.print("Enter the y coordinate of the point: ");
		yCoordinate = inputReader.nextInt();
		xLength = xInput + length;
		yHeight = yInput + height;
		//user input statements
		if (xCoordinate>=xInput && xCoordinate<=xLength && yCoordinate<=yHeight && yCoordinate>=yInput)
		{
			System.out.print("(" + xCoordinate + "," + yCoordinate + ") is inside the box.");
		}
		//if x coordinate is less than/equal to the bottom left corner x value + length
		// AND if y coordinate is greater than/equal to bottom left corner y value + height print statement
		else 
		{
			System.out.print("(" + xCoordinate + "," + yCoordinate +") is not inside the box.");
		}
		inputReader.close();
		//activity 6
		
		
		

	}

}
