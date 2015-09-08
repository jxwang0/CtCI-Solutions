import java.util.*;

public class Six
{
	public static String compress(String str)
	{
		boolean first = false;
		char curChar = str.charAt(0);
		int count = 1;
		StringBuilder finalStr = new StringBuilder();
		finalStr.append(curChar);

		for (int i = 1; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (c == curChar)
			{
				count++;
			}
			else
			{
				curChar = c;
				finalStr.append(count);
				finalStr.append(c);
				count = 1;
			}
		}
		finalStr.append(count);

		String s = finalStr.toString();
		return (s.length() < str.length()) ? s : str;
	}


	public static void main (String [] args)
	{	
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();

		System.out.println(compress(str1));
	}
}