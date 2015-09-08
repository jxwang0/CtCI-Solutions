public class One
{
	public static boolean getBit(int num, int i)
	{
		return ((num & (1 << i)) != 0);
	}

	public static int setBitOne(int num, int i)
	{
		return num | (1 <<i);
	}
	public static int setBitZero(int num, int i)
	{
		return num | (0 <<i);
	}

	public static int insertion (int insertee, int inserter, int start, int end)
	{
		int num = insertee;
		for (int i = start; i <= end; i++)
		{
			System.out.println("for looP");
				if (getBit(inserter, i - start))
				{
					num = setBitOne(num, i);

				}
				else
					num = setBitZero(num, i);
		}
		return num;
	}

	public static void main (String [] args)
	{
		System.out.println(insertion(Integer.parseInt("10000000000",2), Integer.parseInt("10011", 2), 2, 6));
	}
}