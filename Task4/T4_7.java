
//Write a Java program to get the difference between the largest and smallest values in an array ofintegers. The length of the array must be 1 and above.

package task4;

import java.util.Arrays;

public class T4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {55,67,89,65,3};
		
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int max = a[0];
		int min = a[0];
		
		for(int i=1;i<a.length;i++){
			if(a[i] > max){
				max=a[i];
			}else if(a[i] < min){
				min=a[i];
			}
		}		
		System.out.println("Difference between the largest and smallest values in an array of integers: "+(max-min));	
	}

}
