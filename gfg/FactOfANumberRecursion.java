package gfg;

import java.util.Scanner;

public class FactOfANumberRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number to calculate the factorial of a Number");
		int num = sc.nextInt();
		int result = fact(num);
		System.out.println(result +" ");
		

	}
	
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
		
	}

}
