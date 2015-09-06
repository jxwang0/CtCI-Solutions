import java.util.Scanner;

public class One
{
	public static int TripleSteps(int totalSteps)
	{
		return TripleSteps(totalSteps, 1) +
			TripleSteps(totalSteps, 2) +
			TripleSteps(totalSteps, 3);

	}

	public static int TripleSteps(int stepsRemaining, int step)
	{
		if (stepsRemaining == step) return 1;
		if (stepsRemaining < step) return 0;
		int stepsRemainingAfterStep = stepsRemaining - step;
		return TripleSteps(stepsRemainingAfterStep, 1)
		+ TripleSteps(stepsRemainingAfterStep, 2)
		+ TripleSteps(stepsRemainingAfterStep, 3);
	}
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int totalSteps = s.nextInt();
		System.out.println(TripleSteps(totalSteps));
	}
}