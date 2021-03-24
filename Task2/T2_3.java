
// Write a program in Python to implement the given flowchart:



package task2;

public class T2_3 {
      // don't know how to implement in python?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10,b=20,c=30;
       int Avg=(a+b+c)/3;
       
       System.out.println("avg= " +Avg);
       
       if(Avg>a && Avg>b && Avg>c){
    	        System.out.println("avg is higher than a,b,c");
    	   }
       else if(Avg>a && Avg>b){
    	      System.out.println("avg is higher than a,b,c");
    	   }
       else if(Avg>a && Avg>c){
    	   System.out.println("avg is higher than a,c");
    	  }
       else if(Avg>b && Avg>c){
    	   System.out.println("avg is higher than b,c");
    	  }
       else if(Avg>a){
    	   System.out.println("avg is just higher than a");
    	  }
       else if(Avg>b){
    	   System.out.println("avg is just higher than b");
    	  }
       else if(Avg>c){
    	   System.out.println("avg is just higher than c");
    	  }
       else{
    	   System.out.println("default value");
       }
	}

}
