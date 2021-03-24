
//Write a program that accepts three numbers from the user and prints "INCREASING" if the numbersare in increasing order, "DECREASING" if the numbers are in decreasing order, and "Neither increasingnor decreasing order" otherwise.
/* FOR eg
 * Input first number: 1524
 * Input second number: 2345
 * Input third number: 3321
 * Output: INCREASING  
 */




package task3;

import java.util.Scanner;

public class T3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the sceond number: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();
        
        if(a<b && b<c){
        	System.out.println("INCREASING");
        }else if(a>b && b>c){
        	System.out.println("DECREASING");
        }else{
        	System.out.println("Neither increasing nor decreasing order");
        }
        
        
        
        
        
        
        
        
	}

}
