
//Write a Java program to display Pascal's triangle.
/* Test Data
 * Input number of rows: 5
 * Expected Output :
 * Input number of rows: 5
 *        1
 *       1 1
 *      1 2 1
 *     1 3 3 1
 *    1 4 6 4 1    
 * 
 */



package task3;

import java.util.Scanner;

public class T3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
		 System.out.print("Input number of rows: ");
		 int num = input.nextInt();
		 int space=num;
		 
		 for(int i=0;i<num;i++){
			 for(int j=1;j<=space;j++){
				 System.out.print(" ");
			 }
			  int k=1;
			  for(int m=0;m<=i;m++){
				  System.out.print(k + " "); 
				  k = k*(i-m)/(m+1);
			 }
			 space--;
			 System.out.println();
		 }
	}

}
