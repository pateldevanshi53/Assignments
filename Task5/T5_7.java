package Task5;

import java.util.Scanner;

public class T5_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the String: ");
		String s = input.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		
	    String reverseCases = "";
	
	for(int i=0 ;i<s.length();i++) 
	   {
		StringBuilder sb2 = new StringBuilder();
		sb2.append(s.charAt(i));
		
		String currentChar = sb2.toString();
		
		if(currentChar.toLowerCase() ==  currentChar) 
		   {
			reverseCases+=  currentChar.toUpperCase();
		   }
		else if(currentChar.toUpperCase() ==  currentChar) 
		   {
			reverseCases+= currentChar.toLowerCase();
		   }
	    else
		    reverseCases+= currentChar;
	   }
	
	System.out.println("swaps the case of the alphabets of the string: "+reverseCases);
	
	}
	
}
