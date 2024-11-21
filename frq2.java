package apclassroom;

public class frq2 
{

	31Y492VW
	A.A
	
	a)

	public static String letterAndPattern(String letter, String pattern)
	{
		for(int i = 0; i<pattern.length(); i++)
		{
			if(letter.equals(pattern.substring(i, i +1)))
			{
				return letter;
			}
		}
		return pattern.substring(pattern.length(), -1);
	}
	
	b)
	
	private int length;
	//shows the length of any string
	private int threshold;
	//selective choice on how long a string will be
	public static String lengthThreshold(String pattern, int threshold)
	{
		//determines if the legnth of the string is less than or equal to the selective threshold
		//if less than or equal the pattern string is unchanged
		//if greater than the threshold, characters are deleted from the string
	}
	
	
	public static void main(String[] args) 
	{
		

	}

}
