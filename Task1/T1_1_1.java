package task1;


//Swap two numbers using the third variable as a result name and do the same task without using any third variable.
/*Swap two numbers using the third variable as a result name*/



import java.util.Scanner;

public class T1_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of X and Y:");
		int X = input.nextInt();
		int Y = input.nextInt();
		int Z;
		
		System.out.println("Before swapping: "+"X = "+X+" and Y = "+Y);
		Z=X;
		X=Y;
		Y=Z;
		
		System.out.println("After swapping: "+"X = "+X+" and Y = "+Y);
		
		}

	
}


