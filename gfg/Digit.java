package gfg;

public class Digit {

	public static void main(String[] args) {
		
      int num = 0;
     int noOfDigits= countDigits(num);
     System.out.println(noOfDigits);
      
	}
	public static int countDigits(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n<10)
		{
			return 1;
		}
		n= n/10;
		return 1+countDigits(n);
	}
}

