package gfg;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num==0)
		{
			System.out.println(1);
		}
		else if(num ==1)
		{
			System.out.println(1 + " ");
			System.out.println(1);
		}
		else
		{
			System.out.println(1 + " ");
			System.out.println(1 + " ");
			int a=1;
			int b=1;
			for(int i=2; i<=num;i++)
			{				
				int c= a+b; 
				System.out.println(c);
				a=b;
				b=c;				
			}
		}

	}

}
