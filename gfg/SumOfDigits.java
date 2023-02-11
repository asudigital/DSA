package gfg;

public class SumOfDigits {

	public static void main(String[] args) {
		
		
		int result = Sum(0);
		System.out.println(result);
	}
	
	public static int Sum(int n) {
		int sum =0;
		int lastDigit= n%10;
		if(n<10)
		{
			return lastDigit;
		}
		return lastDigit + Sum(n/10);
	}

}
