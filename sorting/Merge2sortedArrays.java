package sorting;
import java.util.Scanner;
public class Merge2sortedArrays {
	static void mergeSort(int a[], int b[]) {
			int m = a.length;
			int n= b.length;
			int i=0;
			int j=0;
			
			while(i<m && j<n) {
				if( a[i] <= b[j]) {
					System.out.print(a[i] + " ");
					i++;
				}
				else {
					System.out.print(b[j] + " ");
					j++;
				}
			}
			while(i<m) {
				System.out.print(a[i] + " ");
				i++;
			}
			while(j<n) {
				System.out.print(b[j] + " ");
				j++;
			}
		}
		
	public static void main(String[] args) {
		
//int []a = {10,20,35};
//int []b = {5 , 50 ,50};
//  mergeSort(a , b);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of String");
		int n1 = sc.nextInt();
		int a[]= new int[n1];
		System.out.println("Enter the values in Array");
		for(int i=0; i<n1;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the length of String");
		int n2 = sc.nextInt();
		int b[]= new int[n2];
		System.out.println("Enter the values in Array");
		for(int i=0; i<n1;i++) {
			b[i] = sc.nextInt();
		}
		mergeSort(a ,b);
	}

}
