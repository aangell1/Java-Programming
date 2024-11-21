package classwork;

public class Recursion 
{

	public static int findFactorial(int num1)
	{
		int counter;
		counter = 1;
		while (num1>1)
		{
			counter = counter*num1;
			counter = (num1-1)*(counter);
			num1 = (num1-2);
		}
		return counter;
	}
	
	public static int findFactorial2(int a)
	{
		if (a <= 0)
		{
			return 1;
		}
		return a * findFactorial2(a-1);
	}
	public static int findFibonacciTerm(int a)
	{
		int previousTerm1, previousTerm2, total = 0;
		previousTerm1 = 0;
		previousTerm2 = 1;
		while (a>1)
		{
			total = previousTerm1 + previousTerm2;
			previousTerm1 = previousTerm2;
			previousTerm2 = total;
			a--;
		}
		return total;
	}
	public static int findFibonacciTerm2(int a)
	{
		if (a <= 2)
		{
			return 1;
		}
		return findFibonacciTerm2(a-1) + findFibonacciTerm2(a-2);
	}
	public static void main(String[] args) 
	{
		System.out.println("Your factorial is: " + findFactorial(3));
		System.out.println("Your factorial is: " + findFactorial2(5));
		System.out.println("Your Fibonacci term is: " + findFibonacciTerm2(6));
		System.out.println("Your Fibonacci term is: " + findFibonacciTerm(6));

	}

}
