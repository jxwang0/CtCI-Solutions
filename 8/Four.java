import java.util.*;

public class Four
{
	public static HashSet<HashSet<Integer>> getAllSets(int [] members)
	{
		HashSet<HashSet<Integer>> powerSet = new HashSet<HashSet<Integer>>();
		HashSet<Integer> initialSet = new HashSet<Integer>();
		for (int e: members)
			initialSet.add(e);
		powerSet.add(initialSet);
		getAllSets(initialSet, powerSet);
		return powerSet;
	}

	public static void getAllSets(HashSet<Integer> set, HashSet<HashSet<Integer>> powerSet)
	{
		for (int e : set)
		{
			HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
			HashSet<Integer> singleSet = new HashSet<Integer>();
			singleSet.add(e);
			clonedSet.remove(e);
			powerSet.add(singleSet);
			powerSet.add(clonedSet);
			getAllSets(clonedSet, powerSet);
		}
	}

	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		int [] numbers = new int [5];
		numbers[0] = s.nextInt();
		numbers[1] = s.nextInt();
		numbers[2] = s.nextInt();
		numbers[3] = s.nextInt();
		numbers[4] = s.nextInt();

		System.out.println(getAllSets(numbers));
	}
}