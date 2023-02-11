package gfg;

class Node{
	int data;
	Node next;
    Node(int x){
    	data =x;
    	next =null;
    }
}
public class ReverseLinkedList {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next= new Node(30);
		head.next.next.next = new Node(40);	
		reverse(head);
	} 
	static void reverse(Node p) {
		
		Node head;
		if(p.next == null) {
			head=p;
			return ;
		}
		reverse(p.next);
		Node q = p.next;
		q.next =p;
		p.next =null;
		
    
	}
	/*How to print reverse linkedlist*/
////	static void printList(Node head)
////	{
////		Node temp = head;
////		for(;temp!=null;) {
////			System.out.println(temp.data);
////		}
//	}
}
