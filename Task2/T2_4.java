
//Write a program in Java to break and continue if the following cases occurs:
/* If user enters a negative number just break the loop and print “It’s Over”
 * If user enters a positive number just continue in the loop and print “Good Going”
 */



package task2;

import java.util.Scanner;

public class T2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the value of a ");
      Double a = input.nextDouble();
      
      while(true){
    	  if(a>0 || a<0)
    		  continue;
    	  
    	    System.out.println("positive");
    	  
    	  
    	   break;
    	  
    	  
      }
      
      
     
	}
      
      
}
      
  
      
	   
	


