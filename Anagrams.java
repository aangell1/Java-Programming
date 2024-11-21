package anagramsproject;

public class Anagrams
{
	public static boolean testAnagram (String str1, String str2)
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str1 = removeSpaces(str1);
		str2 = removeSpaces(str2);
		
		if (str1.length() != str2.length()) 
		{
			return false;
		}
		else 
		{
			int firstLength = str1.length();
			for (int i = 0; i < firstLength; i++) 
			{
				char a = str1.charAt(0);
				for (int j = 0; j < str2.length(); j++) 
				{
					char b = str2.charAt(j);
					if (str2.indexOf(b) != 0 && str2.indexOf(b) != (str2.length() - 1)) 
					{
						if (a == b) 
						{
							str2 = str2.substring(0, j) + str2.substring(j+1);
							j = firstLength + 1;
						}
					}
					else if (str2.indexOf(b) == 0)
					{
						if (a == b)
						{
							str2 = str2.substring(1);
							j = firstLength + 1;
						}
					}
					else 
					{
						if (a == b) 
						{
							str2 = str2.substring(0, j);
							j = firstLength + 1;
						}
					}
				}
				str1 = str1.substring(1);
			}
			if (str2.equals(str1)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
	}
	
	public static String removeSpaces(String str3)
	{
		while (str3.indexOf(" ") != -1)
		{
			str3 = str3.substring(0, str3.indexOf(" ")) + str3.substring(str3.indexOf(" ") + 1);
		}
		return str3;
	}
}
