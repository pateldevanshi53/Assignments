
//Write a JAVA program which takes character input from the user,
/* If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND
 * Print NOT FOUND for all the other alphabets 
 */



package task2;

import java.util.Scanner;

public class T2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character letter: ");
		Scanner input= new Scanner(System.in);
		char ch = input.next().charAt(0);
		
		
		
		//char letter[] = {'r','a','n','d','o','m'};

		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
			if(ch=='r'|| ch=='a'||ch=='n'|| ch=='d'|| ch=='o'|| ch=='m'){
				System.out.println("Found");
			}
			if (ch=='R'|| ch=='A'||ch=='N'|| ch=='D'|| ch=='O'|| ch=='M'){
				System.out.println("FOUND");
			}
			else {
				System.out.println("Not FOUND");
			}
		}
				
				
		
		
		
		
		
		
	}

}
