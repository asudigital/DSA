package exception;
import java.util.*;
import java.io.*;

// compile time exception / checked exception

public class ExceptionHandeling1 {

	public static void main(String[] args) {
		try {
			Scanner sc =new Scanner(new File("Text.in"));
			
			System.out.println("Exit main()");

		}
		catch(FileNotFoundException ex) {
			
			System.out.println("File not Found caught");
		}
		finally {
			System.out.println("finally-block runs regardless of the state of exception");
		}

	}

}
