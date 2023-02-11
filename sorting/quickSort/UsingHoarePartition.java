package sorting.quickSort;

public class UsingHoarePartition {

	public static void main(String[] args) {
	int arr[] = {8,4,7,9,3,10,5};
	int n = arr.length;
		quickSort(arr ,0 , n-1);
		for(int x: arr) {
			System.out.print( x + " ");
		}

	}
	static void quickSort(int arr[] ,int low , int high) {
		
		while(low < high)
		{
			int p = partition(arr , low, high);
			partition(arr , low , p);
			partition(arr , p+1 , high);
		}
	}
	
	static int partition(int a[],int l,int h) {
		int i= l-1;
		int j= h+1;
		int pivot= a[l];
		while(true)
		{
			do {
				i++;
			}while( a[i]<pivot );
			do {
				j--;
			}while(a[j]> pivot);
			
			if(i>=j) return j;				
			int temp = a[i];
			a[i] = a[j];
			a[j]= temp;
		}
	}

}
