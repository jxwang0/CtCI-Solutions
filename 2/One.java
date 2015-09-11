import java.util.HashSet;

public class One
{
	public static void deleteDups(Node node)
	{
		HashSet <Integer> hs = new HashSet<Integer>();

		hs.add(node.data);
		Node prev = node;
		while (node != null)
		{
			if (hs.contains(node.data))
				prev.next = node.next;
			else
			{
				prev = node;
				hs.add(node.data);
			}
			
			node = node.next;
		}
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

		System.out.println(linkedList);
		deleteDups(linkedList);
		System.out.println(linkedList);
	}
}