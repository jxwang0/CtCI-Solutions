import java.util.*;

public class Five
{
	public static int multiply (int num1, int num2)
	{
		return (num1 > num2) ? multiply(num2, num1, new int [num2 + 1]) 
			: multiply(num1, num2, new int[num1 + 1]);
	}

	public static int multiply(int multiplier, int multiplicand, int [] memo)
	{
		if (multiplier == 0) return 0;
		if (multiplier == 1) return multiplicand;

		if (memo[multiplier] == 0)
		{
			memo[multiplier] = multiply(multiplier/2, multiplicand, memo) 
			+ multiply(multiplier - multiplier/2, multiplicand, memo);
		}

		return memo[multiplier];

	}
	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.println(multiply(num1, num2));
	}
}