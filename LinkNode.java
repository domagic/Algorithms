package louis;

public class LinkNode
{
	int value;
	LinkNode next;
	
	public LinkNode()
	{
		this.next = null;
	}
	
	public LinkNode(int value)
	{
		this();
		this.value = value;
	}
}
