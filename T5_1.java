import java.util.Scanner;

public class T5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input= new Scanner(System.in);
		
        System.out.print("Enter spring of words:");
	    String s = input.nextLine();
	  
	    String[] words = s.split(" ");
	    int min= words[0].length(); 
	    for(int i=0; i<words.length; i++)
	      {
	       if(words[i].length()<min)
	    	{
	         min=words[i].length();
	    	}
	      }
	   System.out.println("The length of the shortest word is: " + min);
	 }

}
