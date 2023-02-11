package arrayList;
import java.util.*;
public class PascalTriangle {
	
	 public static List<List<Integer>> PascalRow(int numRows) 
	    {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        List<Integer> row;

	        for (int i = 0; i < numRows; i++) 
	        {
	            int val = 1;
	            row = new ArrayList<Integer>();
	            for (int j = 0; j <= i; j++) 
	            {
	                row.add(val);
	                val = (val * (i - j));
	                val = val / j + 1;
	            }
	        }
	        return res;
	     }

	public static void main(String[] args) {
//		System.out.println("box");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> res = PascalRow(n);
        System.out.println("box2");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.println(res.get(i).get(j));
            }
        }
        
	}

}
