package louis;

public class MyLinkedListNode
{
	int value; // 值域
	MyLinkedListNode next; // 指针域
	
	/**
	 * 默认构造器
	 */
	public MyLinkedListNode()
	{
		this.next = null;
	}
	
	/**
	 * 带值域的构造器
	 * @param value 指定值域的值
	 */
	public MyLinkedListNode(int value)
	{
		this();
		this.value = value;
	}
}
