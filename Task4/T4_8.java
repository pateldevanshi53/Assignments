
//Write a Java program to remove the duplicate elements of a given array and return the new lengthof the array.



package task4;

public class T4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,6,6,5,7,7,9,10,2};  
		System.out.println("Original array length: "+a.length);
		System.out.print("Array elements are: ");
       
		for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            }
		System.out.println("\nThe new length of the array is: "+array_sort(a));
			
        }
    
        public static int array_sort(int a[]){
        int index = 1;
        for(int i=1;i<a.length;i++){
            if (a[i] != a[index-1])
                a[index++] = a[i];
                }
	     return index;
	}

}
