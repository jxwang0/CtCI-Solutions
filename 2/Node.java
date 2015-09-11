public class Node
{
	Node next = null;
	int data;

	public Node(int d)
	{
		data = d;
	}

	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}

	public String toString()
	{
		Node n = this;
		String s = String.format("%d", n.data);
		while (n.next != null){
			n = n.next;
			s = s + String.format(", %d", n.data);
		}
		return s;
	}
}	
