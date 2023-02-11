package stack;


class Node {
	int data;
	Node next;
	Node(int d){
		data =d;
		next =null;
	}
}

class MyStack{
	Node head;
	int sz;
	MyStack(){
		head= null;
		sz =0;
	}
	
	void push(int x) {
		Node temp = new Node(x);
		temp.next = head;
		head =temp;
		sz++;
	}
	int pop() {
		if(head == null)
		{
			return Integer.MAX_VALUE;
		}
		int popEle = head.data;
		head =head.next;
		sz--;
		return popEle;
		
	}
}
public class StackClass {

	public static void main(String[] args) {
		
		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
