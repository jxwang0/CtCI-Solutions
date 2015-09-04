import java.util.*;

public class Three{

	public static boolean isPerm(String str1, String str2)
	{
		if ((str1 != null) != (str2 != null))
			return false;

		if (str1.length() != str2.length()) return false;

		char [] c1 = getSortedArray(str1);
		char [] c2 = getSortedArray(str2);

		for (int i = 0; i < str1.length(); i++)
		{
			if (c1[i] != c2[i])
				return false;
		}

		return true;
	}

	private static char [] getSortedArray(String str)
	{
		char [] c = str.toCharArray();
		Arrays.sort(c);
		return c;
	}

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		System.out.println(isPerm(str1, str2));
	}
}