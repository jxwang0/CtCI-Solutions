import java.util.*;

public class Three
{
	public static String URLify(String s1, int initialLength)
	{ 
		//Corner Cases: Empty String
		//Null String
		//all Spaces
		//No Spaces

		char [] arrC = s1.toCharArray();
		int spaceCount = 0;

		for (int i = initialLength-1; i >= 0; i--)
		{
			if (arrC[i] == ' ')
			{
				spaceCount++;
			}
		}

		for (int i = initialLength-1; i >= 0; i--)
		{
			if (arrC[i] != ' ')
			{
				arrC[i + spaceCount * 2] = arrC[i];
			}
			else
			{
				spaceCount--;
				arrC[i + spaceCount*2] = '%';
				arrC[i + spaceCount*2 + 1] = '2';
				arrC[i + spaceCount*2 + 2] = '0';
			}
		}
		return new String(arrC);
	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int fin = s.nextInt();

		System.out.println(URLify(str, fin));
	}
}