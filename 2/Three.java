public class Three
{
	public static void deleteNode(Node n)
	{
		n.data = n.next.data;
		n.next = n.next.next;
	}

	public static void main (String [] args)
	{
		Node linkedList = new Node(3);
		Node middle = null;
		for (int i = 0; i < 5; i++)
		{
			Node tail = linkedList.appendToTail(i);
			if (i == 3) middle = tail;
		}

		System.out.println(linkedList);
		deleteNode(middle);
		System.out.println(linkedList);
	}
}