package abhilipsa;

public class Se {

	public static void main(String[] args) {
	
     for(int i=1;i<=5;i++) {
    	 System.out.println("");
    	 for(int j=1;j<=5;j++) {
    		 if(i==j)
    		 {
    			 System.out.print(j);
    		 }
    		 else if(j == 6-i)
    		 {
    			 System.out.print(6-i);
    		 }
    		 else {
    			 System.out.print(" ");
    		 }
    	 }
     }
	}

}
