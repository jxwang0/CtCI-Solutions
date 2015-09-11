import java.util.Scanner;
import java.util.HashMap;

public class Two
{
	public static int findKthFromLast(Node linkedList, int k)
	{
		int i = 0;
		Node node = linkedList;
		HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();

		while (node != null)
		{
			hm.put(i, node.data);
			node = node.next;
			i++;
		}

		return (hm.get(i-k));

	}
	public static void main (String [] args)
	{
		Node linkedList = new Node(3);
		for (int i = 0; i < 5; i++)
		{
			linkedList.appendToTail(i);
		}

		for (int i = 0; i < 5; i++)
		{
			linkedList.appendToTail(i);
		}

		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.println(linkedList);
		System.out.println(findKthFromLast(linkedList, k));
	}
}