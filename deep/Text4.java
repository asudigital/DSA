package deep;

public class Text4 {

	public static void main(String[] args) {		
		int a = 'a';
		int z =1;
		char b= (char)z;
		System.out.println(a + " " + b);
//		System.out.println(b);
//		System.out.println("Asu");
//		fibonacciAlphabets(5);
		
	}
     public static void fibonacciAlphabets(int n)
     {
  
       int  first =1;
       int second =1;
       System.out.print(first + " " + second);
      int count =2;
      int sum =0;
      while(count < n)
      {
    	  sum= first + second;
    	  first =second;
    	  second = sum;
    	  count++;
    	  char alpha = (char)sum ;
    	 
    	  System.out.print(" " + sum + alpha);
      }
      
     }
}
