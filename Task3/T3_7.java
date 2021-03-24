
//Write a Java program to find the number of days in a month.
/* Test Data
 * Input a month number: 2
 * Input a year: 2016
 * Expected Output :February 2016 has 29 days
 * 
 */



package task3;

import java.util.Scanner;

public class T3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.print("Input a month number: ");
		int number = input.nextInt();
		
		System.out.print("Input a year: ");
		int year = input.nextInt();
		
		int day=0;
		String month = null;
		
		switch(number){
		case 1:
			month="January";
		    day = 31;
		    break;
		case 2:
			month="Febuary";
		    if(year%4==0){
		    	day=29;
		    }else{
		    	day=28;
		    }
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
		 
		System.out.println(month + " has "+ day + " days");
	}

}
