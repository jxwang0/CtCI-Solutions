import java.util.*;

public class Four
{
	public static boolean isPalPerm(String s)
	{
		s = s.replaceAll(" ", "");
		HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (!hm.containsKey(c))
			{
				hm.put(c, 1);
			}			
			else
			{
				hm.put(c, hm.get(c)+1);
			}	
		}
		int oddCount = 0;
		for (int count : hm.values())
		{
			if (count % 2 != 0)
				oddCount++;
		}

		if (oddCount > 1)
			return false;
		else
			return true;

	}

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		System.out.println(isPalPerm(str1));
	}
}