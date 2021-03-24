
//Write a program in JAVA to perform the following operator based task:
/*Ask the user to choose the following option first:
 * If User Enter 1 - Addition
 * If User Enter 2 - Subtraction
 * If User Enter 3 - Division
 * If User Enter 4 - Multiplication
 * If User Enter 5 - Average 
 * Ask the user to enter the 2 numbers in a variable for first and second (first and second are variablenames) for the first 4 options mentioned above and print the result
 * Ask the user to enter two more numbers as first1 and second2 for calculating the average as soonas the user chooses an option 5
 * In the end, if the answer of any operation is Negative print a statement saying “Oops optionX(1/2/3/4/5/) is returning the negative number”
 * NOTE: At a time users can perform one action at a time
 */


package task2;

import java.util.Scanner;

public class T2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter first the value");
	    float first = input1.nextFloat(); 
	       
	    System.out.println("Enter second the value");
	    float second = input1.nextFloat(); 
	       
	    System.out.println("Enter the option 1 for addition, "+
	       		                        "option 2 for Subtraction, "+
	       		                        "option 3 for Division, "+
	       		                        "option 4 for Multiplication, "+
	       		                        "option 5 for Average, ");
	       int num = input1.nextInt();
	       switch(num){
	       case 1:
	    	     System.out.println("Addition: "+ add(first,second));
	    	     break;
	       case 2:
	    	     System.out.println("Subtraction: "+sub(first,second));
	    	     break;
	       case 3:
	    	     System.out.println("Division: "+multi(first,second));
	    	     break;
	       case 4:
	    	     System.out.println("Multiplication: "+div(first,second));
	    	     break;
	       case 5:
	    	     System.out.println("Average: "+average(first,second));
	    	     break;
	    	default:
	    		System.out.println("invalid value");
	    	  }
	       
	  }

	public static float add(float first, float second) {
		// TODO Auto-generated method stub
		float A=first+second;
		if(A<0){
			   System.out.println("Oops option 1 is returning the negative number");
		}
		return A;
	 }
	
	public static float sub(float first, float second) {
		// TODO Auto-generated method stub
		float B=first-second;
		if(B<0){
			   System.out.println("Oops option 2 is returning the negative number");
		}
		return B;
	}
	
	public static float multi(float first, float second) {
		// TODO Auto-generated method stub
		float C=first*second;
		if(C<0){
			   System.out.println("Oops option 3 is returning the negative number");
		}
		return C;
	}
	
	public static float div(float first, float second) {
		// TODO Auto-generated method stub
		float D=first/second;
		if(D<0){
			   System.out.println("Oops option 4 is returning the negative number");
		}
		return D;
	}
		public static float average(float first, float second) {
			// TODO Auto-generated method stub
			Scanner input2 = new Scanner(System.in);
			float first1 = input2.nextFloat();
			float second1 = input2.nextFloat();
			
			float E=(first+second+first1+second1)/4;
			
			if(E<0){
				   System.out.println("Oops option 5 is returning the negative number");
			}
			return E;
		
	}
}
