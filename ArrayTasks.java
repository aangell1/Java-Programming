package unit5codingactivitiespart1;

import java.util.Arrays;

public class ArrayTasks 
{

	public static void main(String[] args) 
	{
		int[] array1 = new int[30]; 
		for (int i = 0; i<30; i++)
		{
			array1[i] = (int) (Math.random()*21) -10;
		}
		System.out.println(Arrays.toString(array1));
		int[] array2 = array1;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		int sum = 0;
		int[] temp = new int[30];
		for (int j = 0; j<30; j++)
		{
			temp[j] = array1[j];
			sum += array1[j];	
		}
		temp[0] = 100;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(temp));
		System.out.println(sum);
		searchLinear(array1, -9);		
	}
	public static void searchLinear(int [] arr, int num)
	{
		int index = -1;
		for (int j = 0; j<arr.length; j++)
		{
			if (arr[j] == num)
			{
				index = j;
				break;
			}
		}
		if (index == -1) 
		{
			System.out.print(num + " was not found in the array" + index);
		}
		else
		{
			System.out.print(num + " was found in the array at index " + index);
		}
	}

}
