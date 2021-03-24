
//Write a JAVA program that takes one integer input n from the user, and displays all the no, print sumof n natural numbers.



package task3;

import java.util.Scanner;

public class T3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		int i, sum=0;
		
		/*if we enter 10 from user then sum of 10 means 1+2+3+4+5+6+7+8+9+10= ?? */
		 
		for(i=1;i<=n;i++){
			sum = sum+i;
		}
	    System.out.println("sum of n natural numbers:" + sum);
	}
	

}
