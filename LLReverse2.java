public class LLReverse2
{
	public static void main (String [] args)
	{
		int [][] testArrs = {{}, {1, 2, 3}, {1}, {1, 2, 3, 4, 5, 6, 7, 8}};

		Node [] tests = new Node [4];

		for (int i = 0; i < tests.length; i++)
		{
			tests[i] = new Node(testArrs[i]);
			System.out.println(tests[i]);
		}

	}


}