import java.util.*;

public class Five
{
	public static boolean isOneOff(String s1, String s2)
	{
		if ((s1 == null) != (s2 == null))
		{
			return false;
		}
		
		if(s1.equals(s2))
		{
			return true;
		}

		if (s1.length() == s2.length())
		{
			return isOneOffEqualLengths(s1, s2);
		}

		String sL = (s1.length() > s2.length()) ? s1 : s2;
		String sS = (s1 == sL) ? s2 : s1;

		return isOneOffDiffLengths(sS, sL);		
	}

	public static boolean isOneOffEqualLengths(String s1, String s2)
	{
		int count = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) != s2.charAt(i))
				count++;
		}
		return (count > 1) ? false : true;
	}

	public static boolean isOneOffDiffLengths(String sS, String sL)
	{
		if ((sS.length() == 0) && (sL.length() == 1))
			return true;

		for (int i = 0; i < sS.length(); i++)
		{
			if (sS.charAt(i) != sL.charAt(i))
				return sS.substring(i+1).equals(sL.substring(i+2));
		}

		return (sS.length() == sL.length() - 1) ? true : false;
	}

	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		System.out.println(isOneOff(str1, str2));
	}	
}