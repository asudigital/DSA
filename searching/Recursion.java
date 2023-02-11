package searching;
import java.lang.*;
import java.io.*;
public class Recursion {

	static int bSearch(int arr[], int high, int low , int x){
		
		if(low >high)
			return -1;
		int mid = (high + low)/2;
		if(arr[mid] == x)
			return mid;
		if(arr[mid] > x) {
			return bSearch( arr ,  mid-1, low, x);
		}
		else {
			return bSearch(arr, high , mid+1 , x);
		}
	}

  
    public static void main(String[] args) {
		int arr[] = {1,3,5,7,9,11};
		int n = 6;   // length of Array
		int x =11;
	 
		System.out.println(bSearch(arr , n-1 , 0 , x));
		System.out.println( )
	}
}
