package searching;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();		
		if ( n== 1) {
			System.out.println("1");
			return ;
		}
		for(int i=0 ; i<=n/2; i++) 
		{
		if(i*i == n)
		{
			System.out.println(i);
		}
		else {
			System.out.println("it is not a perfect square");
			break;
		}
		}
	}

}
