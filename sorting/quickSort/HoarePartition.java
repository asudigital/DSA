package sorting.quickSort;

public class HoarePartition {
	
	static int hoarePartition(int arr[] , int l , int h) {
		int pivot =arr[l];
		int i = l-1;
		int j = h+1;
		while(true)
		{
			do
			{
				i++;
			}while(arr[i]<pivot);
			do
			{
				j--;
			}while (arr[j] > pivot);
			if(i>=j) return j;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
//     static void swap(int m , int n)
//     {
//    	 int temp = m;
//    	 m=n;
//    	 n=temp;
//     }
	public static void main(String[] args) {
		 
      int arr[] = {5,3,8,4,2,7,1,10};
      int n=arr.length;
      hoarePartition(arr,0,n-1);
      for(int x: arr)
      {
    	  System.out.print(x + " ");
      }
	}
    
}