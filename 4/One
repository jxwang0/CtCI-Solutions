Map <Node, Node> path = new Map<Node, Node>();
Node DFS (Node target)
{
	this.visited = true;
	for (Node n in adj(this))
	{
		if (n.visited == false)
			if (target == (s = n.DFS(target))){
				map.add(n, s);
				return target; 
			}
	}
	return null;
}