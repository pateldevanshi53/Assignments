
//Write a program to complete the task given below:
/* Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z
 * Use z for adding 30 into it and print the final result by using variable results
 */

package task1;

import java.util.Scanner;

public class T1_3 {

		public static void main(String[] args) {
				// TODO Auto-generated method stub
			
		       Scanner input= new Scanner(System.in);
		       System.out.print("Enter the value of a:");
		       int a = input.nextInt();
		       
		       System.out.print("Enter the value of b:");
		       int b = input.nextInt();
		       
		      /* for(a=1;a<=10;a++){
		    	   System.out.println("Accepted value of a is "+ a);
		       } */
		       
		       if(a==1 || a<=10){
		    	   if(b==1 || b<=10){
		    		   System.out.println("value of a is " +a+" AND value of b is " +b);
		    	   } else {
		    	   System.out.println("invalid value of a and b");
		       }
		     }   
		       // if value of a and b invalid then how to stop prog.?
		       int z=a+b;
		       System.out.println("value of z is "+ z);   
		       
		       int var= 30 +z;
		       System.out.println("final value of variable is "+ var);
		       
		     }	
}
