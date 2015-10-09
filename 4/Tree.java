public class Tree {

	public Node root;

	public void inOrderTraversal (Node node, StringBuilder output)
	{
		if (node != null)
		{
		    inOrderTraversal(node.getLeft(), output);
			output.append(String.format("%d, ", node.data));
		    inOrderTraversal(node.getRight(), output);
		}
	}

	public String toString()	
	{
		StringBuilder sb = new StringBuilder("(");
		inOrderTraversal(root, sb);
		sb.append(" )");

		return sb.toString();
	}
}