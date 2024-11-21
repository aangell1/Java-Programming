package classwork;

import java.util.Arrays;

/*
 * Name: Austin Angell and David Bian
 * Date: 1/27/2020
 * Purpose: To complete coding activities using two dimensional arrays.
 */

public class DoubleDArrays
{
	
	
	//Activity 3
	
	public static void averageScore(int[][] twoDArray)
	{
		for (int r = 0; r < twoDArray.length; r++)
		{
			double average = 0;
			for (int c = 0; c < twoDArray[r].length; c++)
			{
				average += twoDArray[r][c];
			}
			average /= twoDArray[r].length;
			
			System.out.println("Student " +  (r + 1) + " Average: " + average);
		}
	}
	
	
	//Activity 5
	
		public static boolean[] improving(int[][] twoDArray)
		{
			boolean[] improve = new boolean[twoDArray.length];
			Arrays.fill(improve, true);
			for (int i = 0; i < twoDArray.length; i++)
			{
				int[] sorted = twoDArray[i].clone();
				Arrays.sort(sorted);
				if (!twoDArray[i].equals(sorted))
				{
					improve[i] = false;
				}
			}
			return improve;
		}


	
	//Activity 4
	
	public static double[] averageScoreArray(int[][] twoDArray)
	{
		double[] averages = new double[twoDArray.length];
		for (int r = 0; r < twoDArray.length; r++)
		{
			double average = 0;
			for (int c = 0; c < twoDArray[r].length; c++)
			{
				average += twoDArray[r][c];
			}
			average /= twoDArray[r].length;
			
			averages[r] = average;
		}
		
		return averages;
	}
	
	
	public static void main(String[] args) 
	{
		
		//Activities 1 and 2
		
		final int numScores = 4, students = 25;
		int[][] testScores = new int[students][numScores];
		
		for (int r = 0; r < testScores.length; r++)
		{
			System.out.print("Student " + (r + 1) + ": ");
			for (int c = 0; c < testScores[r].length; c++)
			{
				testScores[r][c] = (int) (Math.random() * 41) + 60;
				System.out.print(testScores[r][c] + " ");
			}
			System.out.println();
		}
		
		
		//Activity 3 (cont.)
		
		averageScore(testScores);
		
		
		//Activity 4 (cont.)
		
		for (int r = 0; r < testScores.length; r++)
		{
			System.out.println("Test " +  (r + 1) + " Average: " + averageScoreArray(testScores)[r]);
		}
		
		
		//Activity 5 (cont.)
	
	}

}
