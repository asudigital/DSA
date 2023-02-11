package relevel;
import java.math.*;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
         int arr[]= new int[1000];
		for(int i=1 ; i<=k ; i++) {
			int A,B;
			if(k%i == 0) {
				 A =i;
				 B =k/i;
			}
		int g = GCD( A, B);
		
		}
	}

}
