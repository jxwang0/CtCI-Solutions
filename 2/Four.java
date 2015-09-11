import java.util.Scanner;
import java.util.Random;

public class Four
{
	public static Node partition(Node linkedList, int partition)
	{
		Node n = linkedList;
		Node less = new Node();
		Node greaterEqual = new Node();
		Node tail = null;
		
		while (n != null)
		{
			if (n.data < partition) 
			{
				tail = less.appendToTail(n.data);
			}
			else
			{
				greaterEqual.appendToTail(n.data);
			}
			n = n.next;
		}
		if (tail == null)
		{
			return greaterEqual;
		}
		if (greaterEqual.size != 0)
		{
			tail.next = greaterEqual;
		}
		return less;
	}

	public static void main (String [] args)
	{
		Node n = new Node(); 
		Random r = new Random();
		for (int i = 0; i < 8; i++)
		{
			n.appendToTail(r.nextInt(10));
		}

		System.out.println(n);
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		System.out.println(partition(n, p));

	}

}