package gfg;

public class StandardDeviation {

	public static void main(String[] args) {
		int arr[] = {10,22,30,40,50};
		int sum = 0 , sumsq=0;
//		for(int i=0 ; i<arr.length ; i++) {
//			sum += arr[i];
//			sumsq += arr[i] * arr[i];
//		}
		// enhanced for loop 
		double mean , sd;
		for(int item : arr) {
			sum = sum +item;
			sumsq = sumsq + item *item;
		}
		 mean = (double)sum /arr.length;
         //System.out.println(mean);
		 sd = Math.sqrt((double)sumsq/arr.length - mean * mean);
		System.out.printf("mean is:%.2f\n", mean);
		 System.out.printf("Standard deviation is: %.2f" , sd);
	}

}
