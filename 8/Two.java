public class Two
{
	private static int [][] grid =
		{{0, 1, 0, 1, 0},
		{0, 0, 0, 0, 0},
		{0, 1, 1, 1, 1,},
		{0, 0, 0, 0, 1},
		{1, 1, 1, 0, 0,}};
	
	public static boolean go(int i, int j)
	{
		if (i == 4 && j == 4)
		{
			System.out.printf("(%d, %d)", i, j);
			return true;
		}
		boolean right = false , down = false;
		//returns true if block is part of solution
		if (i < 4 && grid[i+1][j] == 0)
		{
			right = go(i+1, j);
		}
		if (j < 4 && grid[i][j+1] == 0)
		{
		    down = go(i, j+1);
		}	

		if (right || down)
		{
			System.out.printf("(%d, %d)", i, j);
	 		return true;
		}
		return false;
	}

	public static void main (String [] args)
	{
		go(0,0);
	}
}