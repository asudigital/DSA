
public class AndroidPattern {

	public static void main(String[] args) {
		
		for (int i=0; i<5;i++) {
			for(int z=0 ;z<i ; z++) {
				System.out.print("  ");
			}
			for(int j=i; j<5 ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
