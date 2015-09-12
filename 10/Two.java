import java.util.*;

public class Two
{
	public static String [] anagramSort(String [] strs)
	{	
		TreeMap <String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();

		for (String str : strs)
		{
			char [] arr = str.toCharArray();
			Arrays.sort(arr);
			String sortedStr = new String(arr);
			if (map.containsKey(sortedStr))
			{
				map.get(sortedStr).add(str);

			}
			else
			{
				ArrayList al = new ArrayList<String>();
				al.add(str);
				map.put(sortedStr, al);
			}
		}
		ArrayList <String> lastAl = new ArrayList<String>();
		for (ArrayList <String> al : map.values())
		{
			lastAl.addAll(al);
		}
		return lastAl.toArray(new String [lastAl.size()]);

	}

	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList <String> al = new ArrayList<String>();
		String str = null;
		for (int i = 0; i < 9; i++)
		{
			al.add(s.nextLine());
		}

		System.out.println(Arrays.toString(al.toArray(new String [al.size()])));
		System.out.println(Arrays.toString(anagramSort(al.toArray(new String [al.size()]))));
	}
}