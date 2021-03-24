
//Write a Java program to find the two elements from a given array of positive and negative numberssuch that their sum is closest to zero.



package task4;

public class T4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,4,-3,-4,-6,9};
        int len = a.length;
        int sum, lowestsum, firstelement, secondelement;
        
        if(len<2){
        	System.out.println("invalid");
        	return;
           }
        
        firstelement=0;
        secondelement=1;
        lowestsum = a[0]+a[1];
        
        for(int i=0;i<len-1;i++)
        {
          for(int j=i+1;j<len;j++)
          {
           sum = a[i] + a[j];
            if(Math.abs(lowestsum) > Math.abs(sum))
            {
              lowestsum=sum;
              firstelement=i;
              secondelement=j;
            }
          }
        }
        System.out.println("Two elements whose sum is minimum are "+
                a[firstelement]+ " and "+a[secondelement]);
        
	}

}
