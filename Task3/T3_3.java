
//Write a JAVA program that takes user input from 1 to 12 for months, and displays the number ofdays of a particular month. (Shows “Invalid Details“ if incorrect month number will be provided).




package task3;

import java.util.Scanner;

public class T3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of month: ");
		int number = input.nextInt();
		int day=0;
		String month = null;
		
		switch(number){
		case 1:
			month="January";
		    day = 31;
		    break;
		case 2:
			month="Febuary";
		    day = 28;
		    break;
		case 3:
			month="March";
		    day = 31;
		    break;
		case 4:
			month="April";
		    day = 30;
		    break;
		case 5:
			month="May";
		    day = 31;
		    break;
		case 6:
			month="June";
		    day = 30;
		    break;
		case 7:
			month="July";
		    day = 31;
		    break;
		case 8:
			month="August";
		    day = 31;
		    break;
		case 9:
			month="September";
		    day = 30;
		    break;
		case 10:
			month="October";
		    day = 31;
		    break;
		case 11:
			month="November";
		    day = 30;
		    break;
		case 12:
			month="December";
		    day = 31;
		    break;
		 default:
			 System.out.println("invalid month");
	    }
		 
		System.out.println("The month "+ month + " has "+ day + " days");
	}

}
