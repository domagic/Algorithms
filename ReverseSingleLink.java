package louis;

public class ReverseSingleLink
{
	public static void printSingleLink(LinkNode head)
	{
		LinkNode cur = head;
		while(cur != null)
		{
			System.out.print(cur.value + "\t");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public static LinkNode reverseSingleLink(LinkNode head)
	{
		// 如果单链表不存在或者单链表长度为1，则直接返回 head
		if(head == null || head.next == null)
		{
			return head;
		}
		
		// 新链表的头指针
		LinkNode p = null;
		// 当前反转的节点指针
		LinkNode cur = head;
		// 反转节点的下一个节点
		LinkNode q = null;
		
		while(cur != null)
		{
			q = cur.next;
			cur.next = p;
			p = cur;
			cur = q;
		}
		return p;
	}
	
	public static void main(String[] args)
	{
		LinkNode head = new LinkNode(1);
		LinkNode cur = head;
		for(int i = 2; i <= 5; ++i)
		{
			cur.next = new LinkNode(i);
			cur = cur.next;
		}
		
		printSingleLink(head);
		head = reverseSingleLink(head);
		printSingleLink(head);
	}
}
