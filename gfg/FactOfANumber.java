package gfg;

import java.util.Scanner;

public class FactOfANumber {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be calculated");
		
		int n=sc.nextInt();
		for(int i=1; i<=n ;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact + "");
	}

}
