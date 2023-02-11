package linkedLists;

public class MyLinkedlist <E> {
	Node head;		
	public void add(E e) {
		 Node toAdd = new Node(e);
		 if(head == null)
		 {
			 head=toAdd;
			 return;
		 }
		 Node temp = head;
		 while(temp.next!=null)
		 {
			 temp= temp.next;
		 }
		 temp.next = toAdd;
	} 
	void Print() {
		Node temp= head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
		
	static class Node{
		int data;
		Node next;
		
		public Node(E e) {
			this.data=e;
		}
	}

}
