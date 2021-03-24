
//Write a program that prints all the numbers from 0 to 6 except 3 and 6.Expected output: 0 1 24 5
package task2;

public class T2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a;
       for(a=0;a<6;a++){
    	   if(a==3 || a==6){
    		   continue;
    		}
    	   System.out.println(a);
       }
	}

}
