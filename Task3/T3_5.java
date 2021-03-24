
//Write a JAVA program that takes long type input from the user, and
/* Calculate and display the number of digits.
 * Calculate the sum of all the digits of the input.
 */


package task3;

import java.util.Scanner;

public class T3_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
	    
	   
		int rem =0, num=0, sum=0;
		num = input.nextInt();
		int count=0;
	   
		while(num>0){
		   rem = num % 10;
		   sum = sum + rem;
		   num= num / 10;
		   count++;
	  }
	    System.out.println("the sum of all the digits: " +sum);
	    System.out.println("number of digits: "+ count);
	
	
	}
	
	
	
	}
	
