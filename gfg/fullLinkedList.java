package gfg;

//class Node{
//	int data;
//	Node next;
//	Node (int x){
//		data =x;
//		next =null;
//		
//	}
//}
public class fullLinkedList {
	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
	
		printNthFromEnd(head, 2);
	}
	static void  printNthFromEnd(Node head , int n)
	{
		int len =0;
		for(Node curr=head; curr!=null; curr=curr.next)	{	
			len++;
//		System.out.println("the value of curr is" + " " + curr );
		}
		System.out.println("the length is"+ " " + len);
			if(len < n)
				return;
		Node curr =head;
		for(int i=1;i<len-n+1 ;i++)
		{
			curr =curr.next;			
		}
		System.out .println(curr.data);
		
	}

}


