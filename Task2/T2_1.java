
//Write a program in JAVA to perform the following operation:
/* If a number is divisible by 3 it should print “Consultadd” as a string
 * If a number is divisible by 5 it should print “JAVA Training” as a string
 * If a number is divisible by both 3 and 5 its should print “Consultadd JAVA Training” as astring
 */

package task2;

import java.util.Scanner;

public class T2_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the variable");
       int num = input.nextInt(); 	
       
       if(num%3==0 && num%5==0){
    	   System.out.println("Consultadd JAVA Training");
    	   }
            else if(num%5==0){
        	     System.out.println("JAVA Training"); 
                 }
                  else if(num%3==0){
           	            System.out.println("Consultadd");
           	           }
                        
        }
}
	

