import java.util.*;
public class InPlace
{
	public static void main (String [] args)
	{	
		//Moderate Problems

		//Problem 17.1
		System.out.println("17.1");
		int num1 = 1, num2 = 2;
		System.out.printf("%d, %d\n", num1, num2);
		
		// add num1 to num2
		num2 += num1;
		
		//Subtract num2 from num1
		num1 -= num2;
		
		//Flip num1
		num1 *= -1;
		
		//Subtract num1 from num2
		num2 -= num1;
		System.out.printf("%d, %d\n", num1, num2);

		prob172();

		}	

		public static void printGrid(boolean [] [] a)
		{
		   for(int i = 0; i < a.length; i++)
		   {
		      for(int j = 0; j < a[0].length; j++)
		      {
		         System.out.printf("%5b ", a[i][j]);
		      }
		      System.out.println();
		   }
		   System.out.println();

		}

		public static boolean checkWin(boolean [][] b)
		{
			for (int i = 0; i < b.length; i++)
			{
				checkRow(i, b);
			}

			for (int i = 0; i < b[0].length; i++)
			{
				checkColumn(i, b);
			}

			checkDiagonals(b);
			return false;

		}

		public static void checkRow(int r, boolean [][] b)
		{	
			boolean trueWins = true;
			boolean falseWins = true;

			for (int i = 0; i < b.length; i++)
			{
				if (trueWins == false && falseWins && false)
					break;

				if (b[r][i] == false)
					trueWins = false;
				else
					falseWins = false;
			}
			if (trueWins)
				System.out.println("TRUE HAS WON");

			if(falseWins)
				System.out.println("FALSE HAS WON");

		}

		public static void checkColumn(int c, boolean [][] b)
		{
			boolean trueWins = true;
			boolean falseWins = true;

			for (int i = 0; i < b.length; i++)
			{
				if (trueWins == false && falseWins && false)
					break;

				if (b [i][c] == false)
					trueWins = false;
				else
					falseWins = false;
			}
			if (trueWins)
				System.out.println("TRUE HAS WON");

			if(falseWins)
				System.out.println("FALSE HAS WON");

		}

		public static void checkDiagonals(boolean [][] grid)
		{
			boolean trueWins = true;
			boolean falseWins = true;

			for (int i = 0; i < grid.length; i++)
			{
				if (trueWins == false && falseWins && false)
				break;

				if (grid [i][i] == false)
					trueWins = false;
				else
					falseWins = false;
			}
			if (trueWins)
			{
				System.out.println("TRUE HAS WON");	
				return;
			}	
			if(falseWins)
			{
				System.out.println("FALSE HAS WON");	
				return;
			}

		    trueWins = true;
			falseWins = true;

			for (int i = 0; i < grid.length; i++)
			{
				if (trueWins == false && falseWins && false)
				break;

				if (grid [i][grid.length - i - 1] == false)
					trueWins = false;
				else
					falseWins = false;
			}
			if (trueWins)
			{
				System.out.println("TRUE HAS WON");	
				return;
			}	
			if(falseWins)
			{
				System.out.println("FALSE HAS WON");	
				return;
			}
		}
		public static void prob172 ()
		{
			//Problem 17.2 
			System.out.println("\n17.2");
			
			//Test Cases
			boolean [][] board1 = {{true, true, false}, {false, false, true}, {false, true, false}};
			boolean [][] board2 = {{true, true, true}, {true, true, true}, {true, true, true}};	
			boolean [][] board3 = {{true, true, false}, {true, true, false}, {true, true, false}};
			boolean [][] board4 = {{true, false, true}, {false, false, true}, {true, false, true}};
			boolean [][] board5 = {{false, false, false}, {true, false, true}, {true, true, true}};
			
			printGrid(board1);
			checkWin(board1);;
			System.out.println();

			printGrid(board2);
			checkWin(board2);;
			System.out.println();

			printGrid(board3);
			checkWin(board3);;
			System.out.println();

			printGrid(board4);
			checkWin(board4);;
			System.out.println();

			printGrid(board5);
			checkWin(board5);;
			System.out.println();

			//min N^2 Algorithm, brute force is N^4
			//checking every possible line is a N^2 algorithm

		}
}