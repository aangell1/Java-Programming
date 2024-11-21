import java.util.Scanner;

import java.lang.Math;


public class directorAngle {
	
	public static void findOrderParameter() {
		
		double directorAngle, result;
		
		for(int i=0; i<=90; i++) {
			
			directorAngle = i;
			
			result = java.lang.Math.cos(directorAngle);
			
			result *= result;
			
			result = (2*result)-1;
			
			System.out.println(result);
		}
		
		
	}

	public static void findDirectorAngle(double e) {
		
		double result;
		
		e += .5;
		
		result = java.lang.Math.sqrt(e);
		
		result = java.lang.Math.acos(result);
		
		System.out.print("The director angle is: " + result);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
			
		Scanner inputReader = new Scanner(System.in);
		double eigenvalue;
		
		eigenvalue = inputReader.nextDouble();
		
		findOrderParameter();
		
		System.out.print("Please enter an eigenvalue for a traceless matrix: ");
		
		findDirectorAngle(eigenvalue);
		
		
			
	}

}
