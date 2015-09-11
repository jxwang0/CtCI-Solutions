//confession: I looked at the hints
public class MinStack
{
	public class StackNode <Item>
	{
		private Item data;
		StackNode nextLowerNode;
		Item minItemUnder; //minimum item that exists under and including this node

		public Item getData () {..};		
	}
	
	// Push compares current minimum to value of this item, and then 
	// creates new Item with the appropriate minItemUnder
	public StackNode <Item> push(Item i){..};
		}
	// Normal Pop
	public StackNode <Item> pop(){..};

}