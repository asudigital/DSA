package deep;
import java.util.*;
public class Text2 {

	public static void main(String[] args) {
		String str = "asu love you"; 

		String s1[] =str.split(" ");
		String ans = "";
//		for(String t:s1)
//		{
//			System.out.println(t);
//		}
		for(int i=0;i<s1.length;i++)
		{
			String temp = s1[i];
			int count =0;
			for(int j=0;j<temp.length()-1;j++)
			{				
				int k=j+1;
				if(temp.charAt(k) > temp.charAt(j))
				{
//					System.out.println("lund");
					count++;
				}
					
			}
			 
			 ans= ans + count;
//			System.out.print(count);
		}
		System.out.println(ans);
	}

}
