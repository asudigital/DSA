package gfgOOPS;

class Node{
	int data;
	Node next;
    Node(int x){
    	data =x;
    	next =null;
    }
}
public class PrintLinkedlistReverse {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next=new Node(20);
		head.next.next= new Node(30);
		head.next.next.next = new Node(40);
		ReversePrint(head);
	}  
	 static void ReversePrint(Node p) {
	   if(p==null) {
		   return;
	   }
	  ReversePrint(p.next); 
	  System.out.println(p.data);
   }
}
