
//Write a Java program to remove duplicate elements from an array.

package task4;

public class T4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {1,2,2,3,3,3,4,4,4,4,5,6,6};
       int len = a.length;
       int t[] = new int[a.length];
       int b=0;
       
       for(int i=0;i<len-1;i++){
    	   if(a[i] != a[i+1]){
    		  t[b++] = a[i]; 
    	   }
       }
         t[b++] = a[len-1];
         for(int c=0;c<b;c++){
        	 System.out.print(" "+t[c]);
         }
       
    }

}
