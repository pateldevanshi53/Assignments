
//Given an integer, perform the following conditional actions:
/*If is odd, print NEW
 * If is even and in the inclusive range of 2 to 5, print OLD
 * If is even and in the inclusive range of 6 to 30, print NEW
 * If is even and greater than 30, print OLD
 * 
 */




package task2;

import java.util.Scanner;

public class T2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      //int a = input.nextInt();
      System.out.println("Enter the value of a");
      int a = input.nextInt();
     
      if (a%2==1){
    	      System.out.println("NEW");
    	  }else if(a%2==0){
    	          if(a>=2 && a<=5){
    	                   System.out.println("OLD");
    	             }else if(a>=6 && a<=30){
    	                   System.out.println("NEW");
    	                   }else if(a>30){
    	                          System.out.println("OLD");
    	                           }
    	                    }
          }
}
