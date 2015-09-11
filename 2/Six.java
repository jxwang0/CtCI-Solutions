import java.util.ArrayList;
public class Six
{
	public static boolean isPalindrome (Node node)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (node != null)
		{
			al.add(node.data);
			node = node.next;
		}

		for (int i = 0; i < al.size()/2 + 1; i++)
		{
			if (al.get(i) != al.get(al.size() - 1 - i))
				return false;
		}
		return true;
	}
	public static void main (String [] args)
	{
		Node llNonPal = new Node(3);
		Node llPal = new Node(-1);
		
		for (int i = 0; i < 5; i++)
		{
			llNonPal.appendToTail(i);
			llPal.appendToTail(i);
		}

		for (int i = 5; i >= -1; i--)
		{
			llPal.appendToTail(i);
		}

		System.out.println(llNonPal);
		System.out.println(llPal);
		System.out.println(isPalindrome(llNonPal));
		System.out.println(isPalindrome(llPal));
	}
}