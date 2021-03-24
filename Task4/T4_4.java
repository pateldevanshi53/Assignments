
//Write a Java program to add two matrices of the same size.

package task4;

import java.util.Scanner;

public class T4_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Input number of rows of matrix: ");
        int a = input.nextInt();
        System.out.print("Input number of columns of matrix: ");
        int b = input.nextInt();

        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.print("Input elements of first matrix: ");
        for(int c=0;c<a;c++){
        	for(int d=0;d<b;d++){
        		array1[c][d] = input.nextInt();
        	    }
        	}
        System.out.println("First Matrix: ");  
        for(int c=0;c<a;c++){
        	for(int d=0;d<b;d++){
        		System.out.print(" " + array1[c][d] + "\t");
        		//System.out.println();
        		}
        	    System.out.println();
        	}
        System.out.print("Input elements of second matrix: ");
        for(int c=0;c<a;c++){
        	for(int d=0;d<b;d++){
        		array2[c][d] = input.nextInt();
        	    }
        	}
        System.out.println("Second Matrix: ");  
        for(int c=0;c<a;c++){
        	for(int d=0;d<b;d++){
        		System.out.print(" " + array2[c][d] + " \t");
        		}
        	    System.out.println();
        	}
        for(int c=0;c<a;c++){
        	for(int d=0;d<b;d++ ){
        		sum[c][d] = array1[c][d] + array2[c][d]; 
        	    }
            }
        System.out.println("Sum of the matrices:-");
        for(int c=0;c<a;c++){
            for(int d=0;d<b;d++ ){
            	System.out.print(sum[c][d]+"\t");
                }  
                System.out.println();
              }
       
    }
	
}
