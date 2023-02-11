package linkedLists;
import java.util.*;
public class MyLinkedlist1 {
	
	public static void main(String[] args) {
		
		MyLinkedlist myLL = new MyLinkedlist();
//		myLL.add(12);
//		myLL.add(56);
		
		for(int i=0; i<10 ;i++)
		{
			myLL.add(i);
		}
		myLL.Print();
	}

}
