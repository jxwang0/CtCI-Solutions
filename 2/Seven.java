import java.util.HashSet;
public class Seven
{
	public static Node findIntersection (Node n1, Node n2)
	{
		HashSet <Node> hs = new HashSet<Node>();
		Node curNode = n1;
		while (curNode != null)
		{
			hs.add(curNode);
			curNode = curNode.next;
		}

		curNode = n2;
		while (curNode != null)
		{
			if (hs.contains(curNode))
				return curNode;
			curNode = curNode.next;
		}

		return null;
	}

	public static void main (String [] args)
	{
		Node LL1 = new Node();
		Node LL2 = new Node();
		Node LLCommon = new Node();

		for (int i = -5; i < 3; i++)
		{
			LL1.appendToTail(i);
		}

		for (int i = 0; i < 5; i++)
		{
			LL2.appendToTail(i);
			LLCommon.appendToTail(i);
		}

		LL1.appendToTail(LLCommon);
		LL2.appendToTail(LLCommon);
		System.out.println(LL1);
		System.out.println(LL2);
		System.out.println(findIntersection(LL1, LL2).data);
	}
}