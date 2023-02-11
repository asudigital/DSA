package linkedLists;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next =null;		
	}
	
}
 public class Basic {
 public static void main(String args[]) {
	 
	 Node head =new Node(10);
	 head.next =new Node(20);
	 head.next.next=new Node(30);
	 head.next.next.next= new Node(40);
	 head.next.next.next.next=new Node(50);
	 printList(head);
 }
 public static void printList(Node head)
 {
//	 System.out.println("bb");
	 Node curr = head;
	 while(curr !=null)
	 {
		System.out.print(curr.data + " "); 
		curr=curr.next;
	 }
 	}
}


