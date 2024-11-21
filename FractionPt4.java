package fractions;

import java.util.Scanner;

import java.util.ArrayList;

/*
 * Name: Austin Angell
 * Date: 3/11/2020
 * Purpose: 
 */

public class FractionPt4 
{

	public static void main(String[] args) 
	{
		Scanner inputReader = new Scanner(System.in);
		int selection;
		ArrayList<Fraction> x = new ArrayList<Fraction>();
		ArrayList<Fraction> list= new ArrayList<Fraction>();
		do
		{
			System.out.println("Menu:");
			System.out.println("1. Display the list of fractions");
			System.out.println("2. Add a fraction to the end of the list");
			System.out.println("3. Insert a fraction at a specific location");
			System.out.println("4. Remove a fraction from a specific location");
			System.out.println("5. Remove a fraction by value");
			System.out.println("6. Replace a fraction at a specific location");
			System.out.println("0. Exit");
			selection = inputReader.nextInt();
			switch (selection)
			{
			case 1:
				System.out.print("The list currently contains:");
				if(x.size() == 0)
				{
					System.out.print("\t No Fractions");
				}
				else
				{
					for(int i = 0; i < x.size(); i++)
					{
						System.out.print(i+1 + ". " + x.get(i) );
					}
				}
				break;
			
			case 2:
				System.out.print("Enter the numerator of the fraction to add: ");
				int numerator = inputReader.nextInt();
				System.out.print("Enter the denominator of the fraction to add: ");
				int denominator = inputReader.nextInt();
				Fraction f1 = new Fraction(numerator, denominator);
				x.add(f1);
				System.out.print("The fraction " + f1 + " has been successfully added to the end of the list.");
				break;
			
			case 3:
				System.out.print("Enter the location where you would like to insert the fraction: ");
				int z= inputReader.nextInt();
				if(z> list.size() || z<1)
				{
					System.out.print("You may only insert fractions in locations between 1 and " + list.size());
				}
				System.out.println();
				System.out.println("Enter the numerator of the new fraction: ");
				int a= inputReader.nextInt();
				System.out.print("Enter the denominator of the new fraction: ");
				int b = inputReader.nextInt();
				Fraction fraclist2 = new Fraction(a,b);
				list.add(z-1,fraclist2);
				System.out.println("The fraction " + fraclist2 + " has been successfully added to the list at location " + z);
				break;
			case 4: 
				System.out.print("Enter the location of the fraction you would like to remove: ");
				int remove= inputReader.nextInt();
				System.out.println("The fraction " + list.remove(remove-1) + " has been successfully removed from the list at location " + remove);
				break;
			case 5:
				System.out.print("Enter the numerator of the fraction to remove: ");
				int nr= inputReader.nextInt();
				System.out.print("Enter the denominator of the fraction to remove: ");
				int dr= inputReader.nextInt();
				Fraction fraclist3= new Fraction(nr, dr);
				int index=0;
				boolean removed=false;
				for(int s=0; s<list.size();s++ )
				{
					Fraction f= list.get(s);
					if(f.compareTo(fraclist3)==0)
					{
						for(int i=list.size()-1; i>=0;i--)
						{
							if(list.get(i) == f)
							{
								index=i;
							}
						}
						list.remove(index);
						removed=true;
						int index1= index+1;
						System.out.println("The fraction " + fraclist3 + " has been successfully removed from the list at location " + index1 + ".");
					}
				}
				if(!removed)
				{
					System.out.println("The fraction " + fraclist3 + " is not in the list.");
				}
				break;
			case 6:
				System.out.println("Enter the location of the fraction you would like to replace: ");
				int loca= inputReader.nextInt();
				int max= list.size();
				int min= 1;
				if(loca>max || loca<min)
				{
					System.out.println("You may only replace fractions in locations between 1" + " and " + list.size());
				}
				else
				{
					System.out.println();
					System.out.println("Enter the numerator of the new fraction: ");
					int num2= inputReader.nextInt();
					System.out.println("Enter the denominator of the new fraction: ");
					int denom2= inputReader.nextInt();
					Fraction fraclist4 = new Fraction(num2,denom2);
					System.out.println("The fraction " + list.get(loca-1) + " has been successfully replaced with the fraction " + fraclist4 + ".");
					System.out.println();
					list.set(loca-1, fraclist4);
					
				}
				break;
				
			}
		}
		while (selection>=1 && selection <=6);
	}

}
