
//Write a program in Java which will find all such numbers which are divisibleby 7 but are not amultiple of 5, between 2000 and 3200.

package task2;

public class T2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a;
		for(a=2000;a<3200;a++){
			
			if(a%7==0 && a%5!=0){
				System.out.print(a+", ");
			}
			
		}
	}

}
