import java.util.HashSet;
import java.util.Scanner;

public class Seven
{
	public static HashSet<String> permutations(String s)
	{
		if (s.length() == 1) 
		{
			HashSet <String> hs = new HashSet<String>();
			hs.add(s);
			return hs;
		}

		HashSet <String> hs = new HashSet<String>();
		for (int i = 0; i < s.length(); i++)
		{
			hs.addAll(combinePerms(permutations(s.substring(0, i) + s.substring(i+1)), s.charAt(i)));
		}

		return hs;
	}

	public static HashSet<String> combinePerms(HashSet<String> hs, char c)
	{
		HashSet<String> perms = new HashSet<String>();
		for (String s1 : hs)
		{
			for (int i = 0; i < s1.length(); i++)
			{
				perms.add(s1.substring(0, i) + c + s1.substring(i));
			}
		}

		return perms;

	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(permutations(str));
	}
}