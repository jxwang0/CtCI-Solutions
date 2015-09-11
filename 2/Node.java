public class Node
{
	Node next = null;
	Integer data;
    int size = 1;

	public Node()
	{
		size = 0;
	}
	public Node(int d)
	{
		data = d;
	}

	public Node appendToTail(int d){
		if (size == 0)
		{
			size++;
			data = d;
			return this; 
		}

		Node end = new Node(d);
		Node n = this;
		while (n.next != null){
			n.size++;
			n = n.next;
		}
		n.size++;

		n.next = end;
		return end;
	}

	public Node appendToTail(Node end)
	{
		if (this.data == null) return null;

		Node n = this;
		while (n.next != null){
			n.size+= end.size;
			n = n.next;
		}
		n.size+= end.size;

		n.next = end;
		return end;

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
