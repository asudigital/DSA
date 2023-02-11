package queue;

//Making Queue dataStructure
class Queue{
	int capacity , size , front , rear;
    int arr[];
//	                                                     constructor
	Queue(int capacity){
		this.capacity = capacity;         
		size =0;
		 arr = new int[10];
	}
	
    boolean isFull()
    {
    	return (size== capacity);
    }
    
    boolean isEmpty()
    {
    	return (size ==0);
    }
    
    void enqueue(int x)
    {
    	if (isFull()) return;
    	
    	arr[size]=x;
    	size++;
    }
    
    int dequeue()
    {
    	if ( isEmpty() )
    	{
    		return -1;
    	}
    	int i=0;
    	int pop = arr[i];
    	
    	for( i=0; i<size ; i++)
    	{
    		arr[i] = arr[i+1];
    	}
    	size--;
    	return pop;
    }
    int getFront() {
    	if(isEmpty())
    		return -1;
    	else
    		return 0;
    }
    
    int getRear() {
    	if (isEmpty())
    	{
    		return -1;
    	}
    	else 
    		return size-1;
    }
    
     void print() {
    	for(int i=0; i<capacity; i++)
    		System.out.print(arr[i] + " ");
    }
    
}
public class QueueConstruction {

	public static void main(String[] args) {		
 
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.enqueue(60);
		
		q.print();
		
		System.out.println( "the pop element is" + " " + q.dequeue() );
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		
	}

}
