package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class DayOfWeek {
	/*
	 * Given the String variable day, determine if the day 
	 * of the week stored in day is a weekday, is a 
	 * weekend day, or an Invalid day.
	   When checking the value of day, make sure that your 
	   code takes into account letter case
	   If the value of day is Monday, Tuesday, Wednesday, Thursday, or 
	   Friday, then print to the console the day and " is a weekday."
	   The output for Tuesday should look like this: "Tuesday is a weekday."
	   If the value of day is Saturday or Sunday, then print to the console 
	   the day and " is a weekend day."
	   The output for Saturday should look like this: "Saturday is a 
	   weekend day."
	   Otherwise, print "Invalid day!"
	 */

	public static void main(String[] args) {
		
		// User interaction
		Scanner input = new Scanner(System.in);
		
		//getting user input
		System.out.println("Enter a day: ");
        String day = input.nextLine();
        
        switch(day.toLowerCase()) {
        	case "monday":
		    case "tuesday":
		    case "wednesday":
		    case "thursday":
		    case "friday":
		    //printing the type of day
		    System.out.println(day + " is a weekday.");
		    break;
		    	
		    case "saturday":
		    case "sunday":
		    //printing the type of day
		    System.out.println(day + " is a weekend day.");
		    break;
		    default:
		    System.out.println("Invalid day!");
		    break;
		    }

	}

}
