
//Swap two numbers using the third variable as a result name and do the same task without using any third variable.
/* do the same task without using any third variable.*/

package task1;

import java.util.Scanner;

public class T1_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of X and Y:");
		int X = input.nextInt();
		int Y = input.nextInt();
	
		
		System.out.println("Before swapping: "+"X = "+X+" and Y = "+Y);
		X = X + Y; //X = 5 + 7 = 12
		Y = X - Y; //Y = 12 - 7 = 5
		X = X - Y; //X = 12 - 5 = 7
		
		System.out.println("After swapping: "+"X = "+X+" and Y = "+Y);
		
		
		
	}

}
