import java.util.HashSet;

public class Eight
{
	public static Node detectLoop (Node n)
	{
		HashSet <Node> hs = new HashSet<Node>();
		Node curNode = n;
		while (curNode != null)
		{
			if (hs.contains(curNode))
			{
				return curNode;
			}
	
			hs.add(curNode);
			curNode = curNode.next;
		}

		return null;
	}

	public static void main (String [] args)
	{
		Node LL1 = new Node();
		Node LL2 = new Node();
		for (int i = -5; i < 3; i++)
		{
			LL1.appendToTail(i);
		}

		LL1.appendToTail(LL1);

		for (int i = -5; i < 0; i++)
		{
			LL2.appendToTail(i);
		}

		LL2.appendToTail(LL1);
		System.out.println(detectLoop(LL2).data);
	}
}