
//Write a program in Java to display the pattern like a right angle triangle with a number.
/* Test Data
 * Input number of rows : 3
 * Expected Output :
 * 1
 * 12
 * 123
 * 
 */




package task3;

import java.util.Scanner;

public class T3_9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Input number of rows: ");
		 int num = input.nextInt();
		 
		 for(int i=1;i<=num;i++){
			 for(int j=1;j<=i;j++){
				 System.out.print(j);
			 }
			 System.out.println(" ");
		 }
		 
	}
}
