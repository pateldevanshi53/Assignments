package Task5;

public class T5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,3,4,5,6,1};
		
	   int max=0,min=100000;
	   int sum = 0;
	   for(int i=0;i<arr.length;i++) 
	     {
		  if(arr[i]>max){
		   max = arr[i];
		   }
		  if(arr[i]<min){
		   min =arr[i];
	      }
	   }
		
	  for(int i =0;i<arr.length;i++) 
		 {
		  if(arr[i]!=max && arr[i]!=min)
		  sum+=arr[i];
		 }
	  
	   System.out.println("the highest value: " + max);
	   System.out.println("the lowest value: " + min);
	   System.out.println("the sum of all the values of the array except the highest and lowest values:" + sum);
		
	}

}
