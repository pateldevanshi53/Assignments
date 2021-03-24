
//Write a Java program to find the second largest element in an array.

package task4;

public class T4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,3,3,3,4,4,4,4,5,6,6};
	    int len = a.length;
	    int largest = Integer.MIN_VALUE;
	    int secondlargest = Integer.MIN_VALUE;
	    
	    for(int i=0;i<len;i++){
	    	if(a[i]>largest){
	    		secondlargest = largest;
	    		largest = a[i];
	    	}
	    	if(a[i]<largest && a[i]>secondlargest){
	    		secondlargest = a[i];
	    	}
	    }
	    System.out.println("second largest number: "+ secondlargest);
	}

}
