// import java.util.*;

// public class PermNoDupes
// {
// 	public static Set<String> permNoDupes (String str)
// 	{	
// 		HashSet<String> hs = new HashSet<String>();
// 		if (str == null)
// 		{
// 			hs.add("no nulls");
// 			return hs;
// 		}

// 		// base case of one character
// 		if (str.length() == 1)
// 		{
// 			hs.add(str);
// 			return hs;
// 		}

// 		// step case of switching the characters around
// 		for (int i = 0; i < str.length(); i++)
// 		{
// 			hs.addAll(getPlacements(str.substring(0, i)  + str.substring(i + 1, str.length()), str.charAt(i)));
// 		}

// 		return hs;
// 	}	

// 	public static Set<String> getPlacements (String str, char c)
// 	{	
// 		// Iterative function that loops through all possible permutations of that string 	
// 		HashSet hs = new HashSet<String>();
// 		for (int i = 0; i < str.length() + 1; i++)
// 		{
// 			hs.add(getPlacement(str, c, i));
// 		}
// 		return hs;
// 	}

// 	public static String getPlacement (String s, char c, int i)
// 	{	
// 		//each of the iterative loops
// 		if (i == s.length())
// 		{
// 			return s + c;
// 		}
// 		if (i - 1 < 0) return s;
// 		return s.substring(0, i - 1) + c + s.substring(i, s.length());
// 	}

// 	public static void main (String [] args)
// 	{	
// 		String [] strTests = {"clictiy", "clackity", "clack", "dupe", "no", "o", "", null};

// 		for (int i = 0; i < strTests.length; i++)
// 		{
// 			System.out.println(permNoDupes(strTests[i]));
// 		}
	
// 	}
// }