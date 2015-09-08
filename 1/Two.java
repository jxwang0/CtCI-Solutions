import java.util.*;

public class Two
{
	public static boolean isPerm(String str1, String str2)
	{
		if ((str1 == null) != (str2 == null))
			return false;

		if (str1.length() != str2.length())
			return false;

		HashMap <Character, Integer> hm1 = 
			new HashMap<Character, Integer>();

		HashMap <Character, Integer> hm2 = 
			new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++)
		{
			update(hm1, str1.charAt(i));
			update(hm2, str2.charAt(i));
		}

		if (hm1.equals(hm2))
			return true;

		return false;
	}

	public static void update(Map map, char c)
	{
		if(!map.containsKey(c))
			map.put(c, 1);
		else
			map.put(c, (int) map.get(c)+1);
	}
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		System.out.println(isPerm(str1, str2));
	}

}