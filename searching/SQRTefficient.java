package searching;

public class SQRTefficient {

	public static void main(String[] args) {
		
		long x=5;
		long y = floorSqrt(x);
		System.out.println(y);		
	}

static long floorSqrt(long x)
 {
	// Your code here
	if(x==0)
	return 0;
	if(x == 1)
	return 1;
 long ans =-1;
	long start =0;
	long end =x;
	
	long mid = start + (end - start)/2;
	
	while(start <= end)
	{
	    long sqr = mid * mid;
	    if(sqr == x)
	    return mid;
	    
	    if(sqr > x)
	    {
	        end = mid -1;
	    }
	    else
	    {
	        ans =mid;
	        start = mid +1;
	    }
	     mid = start + (end - start)/2 ;
	}
	return ans;
 }
}


