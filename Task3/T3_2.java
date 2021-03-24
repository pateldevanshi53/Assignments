
//Write a program in which:
/* Take 10 values input from the user using a loop.
 * A print sum of all the numbers provided
 * Print the average of those 10 values
 */



package task3;

import java.util.Scanner;

public class T3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.print("how many numbers enter in the loop : ");
       int i,sum=0;
       int j = input.nextInt();
       double average= sum/j;
       
       for(i=1;i<=j;i++){
    	  System.out.print("Enter the value of "+i + "=");
    	  int num= input.nextInt();
    	  sum += num;
    	  average= sum/j;
       }
	       System.out.println("the total sum of the nymbers is: "+ sum);
	       
	       System.out.println("the total avaerage of the numbers is: "+ average);
       
       } 

}
