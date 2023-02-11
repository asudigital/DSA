package vectorAndstack;

//import java.util.Vector;
import java.util.Stack;
public class Mainclass {

	public static void main(String[] args) {	
//		Vector <Integer> v=new Vector();
//		v.add(45);
//		v.add(1);
//		System.out.println(v);
		Stack <Integer> stack= new Stack();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
//		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
	}

}
+=