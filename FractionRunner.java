package fractions;

public class FractionRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Proper Fraction Test 1\nStudent Response:");
		ProperFraction pf1 = new ProperFraction(22, 7);
		System.out.println(pf1);
		System.out.println("Expected Response:");
		System.out.println("3 1/7");
		if(pf1.toString().equals("3 1/7"))
			System.out.println("Test 1 Passed\n");
		else
			System.out.println("Test 1 Failed\n");
		
		System.out.println("Proper Fraction Test 2\nStudent Response:");
		System.out.println(pf1.getWhole());
		System.out.println("Expected Response:");
		System.out.println("3");
		if(pf1.getWhole() == 3)
			System.out.println("Test 2 Passed\n");
		else
			System.out.println("Test 2 Failed\n");

		System.out.println("Proper Fraction Test 3\nStudent Response:");
		System.out.println(pf1.getRemainder());
		System.out.println("Expected Response:");
		System.out.println("1");
		if(pf1.getRemainder() == 1)
			System.out.println("Test 3 Passed\n");
		else
			System.out.println("Test 3 Failed\n");
		
		System.out.println("Proper Fraction Test 4\nStudent Response:");
		ProperFraction pf2 = new ProperFraction(22, 4);
		System.out.println(pf2);
		System.out.println("Expected Response:");
		System.out.println("5 1/2");
		if(pf2.toString().equals("5 1/2"))
			System.out.println("Test 4 Passed\n");
		else
			System.out.println("Test 4 Failed\n");
		
		System.out.println("Proper Fraction Test 5\nStudent Response:");
		ProperFraction pf3 = new ProperFraction(6, 14);
		System.out.println(pf3);
		System.out.println("Expected Response:");
		System.out.println("3/7");
		if(pf3.toString().equals("3/7"))
			System.out.println("Test 5 Passed\n");
		else
			System.out.println("Test 5 Failed\n");
		
		System.out.println("Proper Fraction Test 6\nStudent Response:");
		ProperFraction pf4 = new ProperFraction(-22, 4);
		System.out.println(pf4);
		System.out.println("Expected Response:");
		System.out.println("-5 1/2");
		if(pf4.toString().equals("-5 1/2"))
			System.out.println("Test 6 Passed\n");
		else
			System.out.println("Test 6 Failed\n");
		
		System.out.println("Proper Fraction Test 7\nStudent Response:");
		ProperFraction pf5 = new ProperFraction(22, -4);
		System.out.println(pf5);
		System.out.println("Expected Response:");
		System.out.println("-5 1/2");
		if(pf5.toString().equals("-5 1/2"))
			System.out.println("Test 7 Passed\n");
		else
			System.out.println("Test 7 Failed\n");
		
		System.out.println("Proper Fraction Test 8\nStudent Response:");
		ProperFraction pf6 = new ProperFraction(20, 4);
		System.out.println(pf6);
		System.out.println("Expected Response:");
		System.out.println("5");
		if(pf6.toString().equals("5"))
			System.out.println("Test 8 Passed\n");
		else
			System.out.println("Test 8 Failed\n");
	}

}
