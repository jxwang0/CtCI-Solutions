import java.util.Arrays;
public class One
{
	public static void sortedMerge(int [] a, int [] b)
	{
		int aIndex = a.length - b.length - 1;
		int bIndex = b.length - 1;
		for (int i = a.length-1; i >= 0; i--)
		{
			if (bIndex < 0 || (aIndex >= 0 && a[aIndex] > b[bIndex]))
			{
				a[i] = a[aIndex];
				aIndex--;
			}
			else
			{
				a[i] = b[bIndex];
				bIndex--;
			}
		}
	}

	public static void main (String [] args)
	{
		int [] a = {1, 2, 3, 5, 7, 0, 0, 0, 0};
		int [] b = {3, 4, 5, 6};

		System.out.println(Arrays.toString(a));
		sortedMerge(a, b);
		System.out.println(Arrays.toString(a));

		int [] c = {-1, 2, 5, 5, 10, 0, 0, 0, 0};
		int [] d = {-5, -2, 0, 2};

		System.out.println(Arrays.toString(c));
		sortedMerge(c, d);
		System.out.println(Arrays.toString(c));
	}
}