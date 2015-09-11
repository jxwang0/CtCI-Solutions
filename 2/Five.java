import java.util.Scanner;
public class Five
{
	public static Node nodeAddition(Node n1, Node n2)
	{
		Node sum = new Node(0);

		int carry = 0;
		int digitSum;
		while (n1.next != null || n2.next != null)
		{
			if (n1.next == null)
			{
				digitSum = n2.next.data + carry;
				n2 = n2.next;
			}
			else if (n2.next == null) 
			{
				digitSum = n1.next.data + carry;
				n1 = n1.next;
			}
			else
			{
				digitSum = n1.next.data + n2.next.data + carry;
				n1 = n1.next;
				n2 = n2.next;
			}

			if (digitSum > 9)
			{
				digitSum -= 10;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			sum.appendToTail(digitSum);

		}
		return sum;
	}
	public static void main (String [] args)
	{
		Scanner s = new Scanner(System.in);
		int str;
		Node n1 = new Node(0);
		Node n2 = new Node(0);
		while((str = s.nextInt()) > 0)
		{
			n1.appendToTail(str);
		}

		while((str = s.nextInt()) > 0)
		{
			n2.appendToTail(str);
		} 
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(nodeAddition(n1, n2));
	}
}