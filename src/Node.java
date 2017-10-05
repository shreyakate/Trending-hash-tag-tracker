
public class Node {

	public int mData;
	public int mFreq;
	public Node mLeft;
	public Node mRight;
	public DoublyLL mChildren;
	
	public Node()
	{
		mData = 0;
		mFreq = 1;
		mLeft =null;
		mRight = null;
		mChildren = new DoublyLL();
	}
	
	public Node(int data)
	{
		mData = data;
		mFreq = 1;
		mLeft = null;
		mRight = null;
		mChildren = new DoublyLL();
	}
	
	void AddChild(Node childNode)
    {
    	mChildren.Add(childNode);
    	childNode.mLeft = this;
		//System.out.println("Adding child node " +childNode.mNodeID+ "to Node " +mNodeID);
    }
	
	void RemoveChild(Node childNode)
    {
    	mChildren.Remove(childNode);
		childNode.mLeft = null;
		//System.out.println("Removing child node " +childNode.mNodeID+ "from Node " +mNodeID);
    }
	
	 Node PopChild()
	 {
	    Node childNode = mChildren.GetNode(0);
	    RemoveChild(childNode);
	    return childNode;
	 }
}
