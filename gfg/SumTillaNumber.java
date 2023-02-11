package gfg;

public class SumTillaNumber {

	public static void main(String[] args) {
		int res = recursiveSum(45);
		System.out.println(res);

	}
    public static int recursiveSum(int N)
    {
        // recursively sum from 1 to N
        
        if(N==1)
        {
            return 1;
        }
        
        return N + recursiveSum(N-1);
    }

}
