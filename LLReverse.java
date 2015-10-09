import java.util.*;
public class LLReverse
{
	public static Node reverse (Node head)
	{
					System.out.println("loop1");

		ArrayList <Node> al = new ArrayList<Node>();
		cur = head;
		while (cur.next != null)
		{
			al.add(cur);
			cur = cur.next;
			System.out.println("loop1");
		}

		int size = al.size();
		Node start = new Node(al.get(size - 1));
		for (int i = al.size-2; i >= 0; i--)
		{
			System.out.println("loop2");
			start.appendToTail(al.get(i));
			start = start.next;
		}
	}

	public static void main (String [] args)
	{
		int [][] testArrs = {{}, {1, 2, 3}, {1}, {1, 2, 3, 4, 5, 6, 7, 8}};

		Node [] tests = new Node [4];

		for (int i = 0; i < tests.length; i++)
		{
			tests[i] = new Node(testArrs[i]);
			System.out.println(tests[i]);
			System.out.println(reverse(tests[i]));
		}

	}
}