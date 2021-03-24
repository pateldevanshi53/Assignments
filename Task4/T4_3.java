
//Write a Java program to find the second smallest element in an array.

package task4;

public class T4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,3,3,3,4,4,4,4,5,6,6};
	    int len = a.length;
	    int smallest = Integer.MAX_VALUE;
	    int secondsmallest = Integer.MAX_VALUE;
	    
	    for(int i=0;i<len;i++ ){
	    	if(a[i]<smallest){
	    		secondsmallest = smallest;
	    		smallest = a[i];
	    	}
	    	if(a[i]>smallest && a[i]<secondsmallest){
	    		secondsmallest = a[i];
	    	}
	    }
	    System.out.println("second smallest number: "+ secondsmallest);
     
	}

}
 