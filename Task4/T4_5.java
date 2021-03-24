
//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other(non-zero) array elements.

package task4;

import java.util.Arrays;

public class T4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]  = {9,0,4,5,6,7,0,2,0,0};
		int len = a.length; 
        int count = 0;
		
        System.out.println("Original array: " + Arrays.toString(a));
		/*for(int n: a){
			System.out.print(n + " " );
		   } */
		
		for(int i=0;i<len;i++){
           if(a[i] != 0){
        	   a[count++]=a[i];
              }
         }  
       
		while(count<len){
        	a[count++]=0;
           }
       
		for(int j=0;j<len;j++){
    	   System.out.print("After moving 0's to the end of the array: " + Arrays.toString(a));
    	   
   			//System.out.print(" "+a[j]+" ");
   			
    	}
          
    }

}
