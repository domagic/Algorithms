package louis;

public class ReverseLinkedList
{
	/**
	 * 输出单链表元素
	 * @param head 单链表的第一个节点指针
	 */
	public static void printSingleLink(MyLinkedListNode head)
	{
		MyLinkedListNode cur = head;
		while (cur != null)
		{
			System.out.print(cur.value + "\t");
			cur = cur.next;
		}
		System.out.println();
	}
	
	/**
	 * 反转单链表
	 * @param head 指向第一个节点的指针，方法结束后指向反转后链表的第一个节点的指针
	 */
	public static void reverseSingleLink(MyLinkedListNode head)
	{
		// 如果单链表不存在、单链表长度为 1，则直接返回 head
		if (head == null || head.next == null)
		{
			return;
		}
		
		// 新链表的头指针
		MyLinkedListNode p = null;
		
		// 当前反转的节点指针
		MyLinkedListNode cur = head;
		
		// 反转节点的下一个节点指针
		MyLinkedListNode q = null;
		
		// 当反转节点不为空，说明还有节点没有反转，则进行反转操作
		while (cur != null)
		{
			q = cur.next;
			cur.next = p;
			p = cur;
			cur = q;
		}
		head = p;
	}
	
	public static void main(String[] args)
	{
		MyLinkedListNode head = new MyLinkedListNode(1);
		MyLinkedListNode cur = head;
		for (int i = 2; i <= 5; ++i)
		{
			cur.next = new MyLinkedListNode(i);
			cur = cur.next;
		}
		
		printSingleLink(head);
		reverseSingleLink(head);
		printSingleLink(head);
	}
}
