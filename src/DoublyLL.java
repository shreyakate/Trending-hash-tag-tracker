
public class DoublyLL 
{
	Node 	mStart;
	Node	mEnd;
	Node    mIterator;
	int 	mSize;
	
	public DoublyLL()
	{
		mStart = mEnd = null;
		mSize = 0;
		
	}

	public void Add(Node newNode) 
	{
		/*if(mLeft != null)
			System.out.println("Add called on RootNodeList with node " +newNode.mNodeID);
		else
			System.out.println("Add called on children list with node " +newNode.mNodeID);*/
		
		if(mStart == null && mEnd == null)
		{
			//If this is the first node to be added in the list
			//then mark this node as the start and end of the list  --- here it will be null 
			mStart = mEnd = newNode;
			newNode.mLeft = null;
			newNode.mRight = null;
			//System.out.println("This is the first element in the list. So setting the mStart, mEnd, mLeft, mRight to this node " +newNode.mNodeID);
		}
		else
		{
			//If this is not the first element then
			//1. add this node to the start of the list (i.e left most element)
			//2. make the pointers point to the right nodes
			//3. make the newNode as the end node of the list
			newNode.mRight= mStart;
			newNode.mLeft = null; 
			mStart.mLeft = newNode;
			mStart = newNode;
			
			//System.out.println("Added a newNode " +newNode.mNodeID+ "to the list");
		}
		
		++mSize;
		
	}

	public void Remove(Node childNode) {
		// TODO Auto-generated method stub
		
	}

	public Node GetNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
