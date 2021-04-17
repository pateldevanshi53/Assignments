package Task5;

import java.util.Scanner;

public class T5_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String s = input.nextLine();
		
		String inputArray[] = s.split(" ");
        
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i <inputArray.length;i++) 
		   {
			StringBuilder sb2 = new StringBuilder(inputArray[i]);
			sb.append(sb2.reverse().toString());
			sb.append(" ");
		   }
		
		System.out.println("the reverses the words of a sentence: " +sb.toString());
	}

}
