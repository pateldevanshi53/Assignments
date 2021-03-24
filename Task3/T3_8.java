
//Write a Java program that takes a year from the user and prints whether that year is a leap year ornot.


package task3;

import java.util.Scanner;

public class T3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Input a year: ");
		 int year = input.nextInt();
		 
		 if(year%4==0){
		    	System.out.println("leap year");
		    }else{
		    	System.out.println("no leap year");
		    }
	}

}
