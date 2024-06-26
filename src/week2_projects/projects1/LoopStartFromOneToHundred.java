package week2_projects.projects1;

import java.io.*;
import java.util.*;

public class LoopStartFromOneToHundred {
	/*
	 * Given the variable userValue, create a for loop that 
	 * starts at 1 and goes to 100 including the value 100, 
	 * printing the value of the counter to the console each 
	 * time the loop processes.
       The for loop should iterate from 1 up to and including 100
       The for loop should increment the counter by the amount 
       stored in userValue
       The for loop should print the counter to the console at every iteration
	 */

	public static void main(String[] args) {
		// User interaction
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		
		int userValue;
		
		//getting user input
		userValue = in.nextInt();


        for(int i = 1; i <= 100; i+= userValue) {
			//printing the value of the counter
			System.out.println(i);
		}
	
        //Write a for loop that prints every even number from 0 to 100, including 100.
        for(int i =1; i< 101; i++) {
        	if(i%2==0) {}
        	System.out.println(i);
        }

	}

}
