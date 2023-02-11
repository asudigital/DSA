package gfg;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till to which sum to be calculated");
		int n = sc.nextInt();
		int summationValue = sum(n);
		System.out.println(summationValue);
	
	}
	static int sum( int x)
	 {
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else {
		return x + sum(x-1);
			
		}
	 }

}
