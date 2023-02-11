package linkedLists;


  class ListNode {
	       int val;
	       ListNode next;
	       ListNode() {}
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
public class Basic1 {

	public static void main(String[] args) {
		ListNode h1 = new ListNode(5);
		h1.next = new ListNode(7);
		h1.next.next = new ListNode(9);
		printList(h1);
//		ListNode h2 = new ListNode()

	}
	public static void printList(ListNode head)
	 {
//		 System.out.println("bb");
		 ListNode curr = head;
		 while(curr !=null)
		 {
			System.out.print(curr.val + " "); 
			curr=curr.next;
		 }
	 	}

}
