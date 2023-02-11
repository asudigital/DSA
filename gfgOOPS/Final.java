package gfgOOPS;

public class Final {

	public static void main(String[] args) {
		
//		local final variable because it is in amethod
		final int x; 
		x=100;
//		System.out.println(x);
		Test t= new Test();
 System.out.println(t.x);
	}

}
class Test{
	final int x=100;
//	public static void main(String[] args) {
//		Test t=new Test();
//	}
	
}
