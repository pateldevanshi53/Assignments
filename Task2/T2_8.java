
//Write a Java program that reads a floating-point number and prints "zero" if the number is zero.Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,or "large" if it exceeds 1,000,000.



package task2;

import java.util.Scanner;

public class T2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input= new Scanner(System.in);
	    System.out.println("Enter the floating-point number: ");
	    double a = input.nextDouble();
	    
	    if(a>0){
	    	System.out.println("positive");
	    }else if(a<0){
	    	System.out.println("nagetive");
	    }else{
	    	System.out.println("zero");
	    }
		
	    if(a<1){
	    	System.out.println("small");
	    }else if(a>1000000){
	    	System.out.println("large");
	    }
		
	}

}
