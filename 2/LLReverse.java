import java.util.*;
public class LLReverse
{
	public static Node reverse (Node head)
	{
					

		ArrayList <Node> al = new ArrayList<Node>();
		Node cur = head;
		while (cur.next != null)
		{
			cur = cur.next;
			al.add(cur);
		}
		int size = al.size();

		if (size == 0)
			return null;
		Node start = new Node(al.get(size - 1).data);
		System.out.println(start);
		Node fin = start;
		for (int i = size-2; i >= 0; i--)
		{
			
			start.appendToTail((al.get(i) == null) ? null : al.get(i).data);
			start = start.next;
		}
		return fin;
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