public class Two
{
	public static Tree createMinimalBST (int [] sortedElements)
	{
		Tree t = new Tree();
		Node n = new Node();
		n.data = sortedElements[sortedElements.length/2];		t.root = n;
	 	createMinimalBST(sortedElements, 0, sortedElements.length - 1, n);
		return t;
	}

	public static Node createMinimalBST (int [] sortedElements, int start, int end, Node parent)
	{	


		if (start <= end)
		{	
			int mid = (end - start) /2 + start;
			if (parent == null)
			{
				parent = new Node(sortedElements[mid]);
			}
			parent.children.add(0, 	createMinimalBST(sortedElements, start, mid - 1, parent.getLeft()));
			//System.out.println("left");
			//System.out.printf("%d : %d, element is %d\n", start, mid - 1, (parent.getLeft() != null ) ? parent.getLeft().data : -12345);

			//System.out.printf("%d : %d, element is %d\n", mid + 1, end, (parent.getRight() != null ) ? parent.getRight().data : -12345);
			parent.children.add(1, createMinimalBST(sortedElements, mid + 1, end, parent.getRight()));
			//System.out.println("right");
			//System.out.printf("%d : %d, element is %d\n", mid + 1, end, (parent.getRight() != null ) ? parent.getRight().data : -12345);

			return parent;
		}
		return null;
		
	}

	public static void main (String [] args)
	{
		int [] arr1 = {0, 1, 2, 3, 4, 5, 6};
		int [] arr2 = {-1, 0, 3, 5, 9, 10};
		int [] arr3 = {5, 9, 100, 100};

		System.out.println(createMinimalBST(arr1));
		System.out.println(createMinimalBST(arr2));
		System.out.println(createMinimalBST(arr3));
	}
}