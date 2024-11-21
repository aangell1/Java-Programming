package classwork;
import java.lang.Math;

public class classWork 
{

	public static void main(String[] args) 
	{
		int x;
		int y;
		x = 9;
		y = 16;
		Math.abs(x-y);
		Math.pow(x,y);
		Math.sqrt(x);
		Math.random();
		double absoluteValue;
		double exponets;
		double squareRoot;
		int randomNumber;
		absoluteValue = Math.abs(x-y);
		exponets = Math.pow(x,y);
		squareRoot = Math.sqrt(x);
		randomNumber = (int)((Math.random()*6)+1);
		System.out.println("Absolute value answer: " + absoluteValue);
		System.out.println("Exponential value: " + exponets);
		System.out.println("Square root value: " + squareRoot);
		System.out.println("Your random number is: " + randomNumber);
		
		
		
		

	}

}
