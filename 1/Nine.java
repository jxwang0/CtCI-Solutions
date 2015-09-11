import java.util.Scanner;
public class Nine
{
	public static boolean isRotation(String s1, String s2)
	{
		if (s1.length() == s2.length()) return false;
		String s1Double = s1 + s1;
		return s1Double.contains(s2);

	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();

		System.out.println(isRotation(str1, str2));
	}
}