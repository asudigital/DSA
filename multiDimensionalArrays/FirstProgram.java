package multiDimensionalArrays;

public class FirstProgram {

	public static void main(String[] args) {
		
		int arr[][] = {{1 , 2, 3},
		               {4 , 5 ,6}};
		System.out.println(arr.length);
		for(int i=0 ;i<arr.length ; i++ )
		{
			for(int j = 0; j < arr[j].length; j++)
    		{
    			System.out.print(arr[i][j] + " ");
    		}
			
		}
		
	}

}
