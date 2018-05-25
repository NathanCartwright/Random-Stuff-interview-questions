/*
 * Nathaniel Cartwright
 * This code takes a given array and tries to find a pair of numbers that multiply to equal 20
 * The array is built by the user to test
 */

import java.util.Scanner;

public class multiples {

	public static void main(String [] args) {
		
		// initialize the array dynamically using a scanner.
		
		int size = 0;
		System.out.println("please enter the size of the array you would like to test");
		
		Scanner get = new Scanner(System.in);
		size = get.nextInt();
		// set the size of the array based on user input
		int[] nums = new int[size];
		System.out.println("please fill the array with the numbers you would like to test");
		//fill the custom array desired for user
		for (int i = 0; i < nums.length; i++){
			
			nums[i] = get.nextInt();
			
		}
		
		System.out.println("please enter the target number you want to multiply to");
		int target = 0;
		target = get.nextInt();
		
		//close scanner
		get.close();
		
		// printing the array just to test...
		// print out the tuple that makes 20.
		for (int i = 0; i < nums.length-1; i++) {
			
			for( int j = i+1; j < nums.length; j++) {
				
				if((nums[i] * nums[j] == target)) {
					System.out.printf("The Target Was %d: This is the tuple that makes it [%d,%d]", target, nums[i], nums[j]);
					
				}
					
					
					}
			}
			

		}
		
		
	}
	

