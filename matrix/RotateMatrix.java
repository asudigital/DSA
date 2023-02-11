package matrix;
import java.util.Arrays;
public class RotateMatrix {

	public static void main(String[] args) {
		
	 String a[]= {"GFG","IDE"};
	 String b[] = {"gfg","ide"};
	 if(Arrays.compare(a,b, String::compareToIgnoreCase)==0)
	 System.out.println("yes");
	 
	 else	 
		 System.out.println("no");	 

	}

}
