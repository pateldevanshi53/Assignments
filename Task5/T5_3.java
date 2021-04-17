package Task5;

import java.util.Scanner;

public class T5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the String: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		System.out.println(s.replaceAll(" ", ""));
	}

}
