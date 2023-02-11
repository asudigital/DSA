package queue;

//Making Node in LinkedList
class Node{
	Node head;
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class QueueLinkedList {

	Node front , rear;
	int size=0;
//	constructor of class
	public QueueLinkedList() {
		this.front=this.rear=null;
	}
//	Enqueue function
	void enqueue(int key) {
		Node temp = new Node(key);
		if(this.rear == null) {
			this.front = this.rear =temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
		size++;
	}
//	Dequeue function
	void dequeue() {
		if(this.front == null)
		{
			return;
		}
//		Node pop = this.front;
		this.front = this.front.next;
		size--;
//		dequeuing the last element
		if(this.front == null)
		{
			this.rear = null;
		}
//		PrintList
	
		
	}
	
//	Main function
	public static void main(String[] args) {
		
      QueueLinkedList q = new QueueLinkedList();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      q.dequeue();
      System.out.println(q.front.data);
      System.out.println(q.rear.data);
      
	}

}
