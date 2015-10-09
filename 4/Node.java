import java.util.ArrayList;

public class Node {
	
	public int data;
	public ArrayList <Node> children = null;
	public Node()
	{
		children = new ArrayList();
		children.add(0, null);
		children.add(1, null);
	}

	public Node(int i)
	{
		this();
		data = i;
	}

	public Node getLeft()
	{
		return children.get(0);
	}

	public Node getRight()
	{
		return children.get(1);
	}


	public void setLeft(int i)
	{
		children.set(0, new Node(i));
	}

	public void setRight(int i)
	{
		children.set(1, new Node(i));
	}
}