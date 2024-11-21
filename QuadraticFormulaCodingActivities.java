package codingactivities;
import java.lang.Math;
import java.util.Scanner;
/*
 * Name: Austin Angell
 * Data: 9/13/2019
 * Purpose: To complete the quadratic formula coding activity given inputs/values for the variables from the user.  
 */

public class QuadraticFormulaCodingActivities 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("The formula for a quadratic function is y=ax^2+bx+cx");
		System.out.print("Please input an \"a\" value for the quadratic formula: ");
		a = inputReader.nextDouble();
		System.out.print("Please input an \"b\" value for the quadraric formula: ");
		b = inputReader.nextDouble();
		System.out.print("Please input an \"c\" value for the quadraric formula: ");
		c = inputReader.nextDouble();
		double positiveAnswer;
		double negativeAnswer;
		//Although answer is not always negative, "b" is being subtracted by the value.
		positiveAnswer = (-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
		negativeAnswer = (-b-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
		System.out.printf("\nOne solution is: %.3f", positiveAnswer);
		System.out.printf("\nThe other solution is: %.3f", negativeAnswer);
		inputReader.close();
		
		
		

	}

}
