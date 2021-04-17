package Task5;

public class T5_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {23,25,75,87,47,1,91,51,2};
		int[] array2 = {22,44,64,76,98,12,43,54,90};
		
		for(int i=0; i<array1.length;i++) 
		    {
			if (array1[i]%2==0){
				System.out.println("the even from the odds: "+ array1[i]);
			    }
		   }
		
		for(int i=0; i<array2.length;i++) 
	    {
		if (array2[i]%2==1){
			System.out.println("the odd from the evens: "+ array2[i]);
		    }
	   }
	
		
	}
}
