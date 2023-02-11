package abhilipsa;
import java.util.Scanner;
public class Kunu {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the mark of first subject");
// total mark of each sub is 100 and total mark is 300
//   Taking input of each subject
   float sub1 = sc.nextFloat();
   System.out.println("Enter the mark of second subject");
   float sub2 = sc.nextFloat();
   System.out.println("Enter the mark of third subject");
   float sub3 = sc.nextFloat();
//   Calculation of total marks
   float totalMarks = sub1 + sub2 + sub3;
   System.out.println("The total marks of the student is" + totalMarks);
//   Calculation of percentage
   float percentage = (totalMarks/300)*100;
   System.out.println("The percentage obtained is" + percentage);
   
//   Grading of the students
   if(percentage >=60) {
	   System.out.println("First position");
   }
   else if(percentage>=50 && percentage<=59) {
	   System.out.println("Second position");
   }
   else if(percentage>=30 && percentage<=49) {
	   System.out.println("Third position");
   }
   else {
	   System.out.println("Student is failed");
   }
	}

}
