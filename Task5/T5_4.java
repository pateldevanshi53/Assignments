package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class T5_4 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner input= new Scanner(System.in);
		
	   System.out.println("Enter the spring: ");
	   String s = input.nextLine();
	   
	   System.out.println(isogram(s));
	   }

	public static boolean isogram(String str) {
	str = str.toLowerCase();

	  char[] Arr = str.toCharArray();
	  Arrays.sort(Arr);

	  for(int i=0; i<Arr.length-1;i++) 
		{
		if(Arr[i]==Arr[i+1])
		return(false);
		}
		return(true);
		
	}
	
}


