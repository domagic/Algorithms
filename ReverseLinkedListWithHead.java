package louis;

public class ReverseLinkedListWithHead
{
	/**
	 * 输出带头结点的单链表
	 *
	 * @param head 头结点，方法结束后指向反转后单链表头结点的指针
	 */
	public static void printLinkedList(MyLinkedListNode head)
	{
		MyLinkedListNode cur = head.next;
		while (cur != null)
		{
			System.out.print(cur.value + "\t");
			cur = cur.next;
		}
		System.out.println();
	}
	
	/**
	 * 反转带头结点的单链表
	 *
	 * @param head 头结点
	 */
	public static void reverseLinkedListWithHead(MyLinkedListNode head)
	{
		// 如果单链表不存在、单链表长度为 0、单链表长度为 1，则直接返回
		if (head == null || head.next == null || head.next.next == null)
		{
			return;
		}
		
		// 指向待反转节点的指针
		MyLinkedListNode cur = head.next;
		
		// head 作为反转后链表的头结点，初始时它的下一节点为空
		head.next = null;
		
		// 指向待反转节点的下一个节点的指针
		MyLinkedListNode p = null;
		
		// 头插法 -- 将反转节点插入到头结点与头结点下一个节点之间
		while (cur != null)
		{
			p = cur.next;
			cur.next = head.next;
			head.next = cur;
			cur = p;
		}
	}
	
	
	public static void main(String[] args)
	{
		// 头结点 -- 值域可以不存放，也可以存放一些其他信息
		MyLinkedListNode head = new MyLinkedListNode();
		
		MyLinkedListNode cur = head;
		for (int i = 1; i <= 5; ++i)
		{
			cur.next = new MyLinkedListNode(i);
			cur = cur.next;
		}
		
		printLinkedList(head);
		reverseLinkedListWithHead(head);
		printLinkedList(head);
	}
}
